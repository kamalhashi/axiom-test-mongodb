package com.axion.test.repository;

import com.axion.test.model.document.SearchHistory;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;


@Slf4j
@SpringBootTest
public class HistorySearchRepositoryTest {

    @Autowired
    HistorySearchRepository historySearchRepository;

    @BeforeEach
    public void init() {
        //lets clear the db first
        String[] keywords = { "200", "", "", "" };
        SearchHistory searchHistory = SearchHistory.builder()
                 .keywords(keywords)
                 .build();
        Mono<SearchHistory> savedSearchKeywords= historySearchRepository.deleteAll().then( historySearchRepository.save(searchHistory));
        StepVerifier.create(savedSearchKeywords)
                .expectNextCount(1)
                .verifyComplete();
    }

    @Test
    public void findAll() {
        Flux<SearchHistory> result = historySearchRepository.findAll();
        StepVerifier.create(result)
                .expectNextMatches( searchHistory -> searchHistory.getKeywords()[0].equalsIgnoreCase("200"))
                .expectComplete()
                .verify();

    }

}