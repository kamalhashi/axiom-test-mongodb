package com.axion.test.repository;

import com.axion.test.model.document.SearchHistory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorySearchRepository extends ReactiveMongoRepository<SearchHistory, String> {
}
