package com.axion.test.config;

import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import com.mongodb.reactivestreams.client.MongoClient;

/**
 * Created By Gorantla, Eresh on 12/Dec/2019
 **/
@Configuration
@EnableMongoAuditing
public class MongoConfiguration extends AbstractReactiveMongoConfiguration {

    @Value("${spring.data.mongodb.database}")
    private String database;

    @Value("${spring.data.mongodb.host}")
    private String host;

    @Value("${spring.data.mongodb.port}")
    private int port;

    @Override
    public MongoClient reactiveMongoClient() {
        return  MongoClients.create();
    }

    @Override
    protected String getDatabaseName() {
        return database;
    }


}
