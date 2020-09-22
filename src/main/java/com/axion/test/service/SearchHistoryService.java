package com.axion.test.service;

import com.axion.test.model.document.SearchHistory;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface SearchHistoryService {

    Mono<SearchHistory> save(SearchHistory searchHistory);
    Flux<SearchHistory> findAll();

}
