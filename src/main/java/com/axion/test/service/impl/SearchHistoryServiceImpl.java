package com.axion.test.service.impl;

import com.axion.test.model.document.SearchHistory;
import com.axion.test.repository.HistorySearchRepository;
import com.axion.test.service.SearchHistoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class SearchHistoryServiceImpl implements SearchHistoryService {
    @Autowired
    private HistorySearchRepository searchHistoryRepository;

    @Override
    public Mono<SearchHistory> save(SearchHistory searchHistory) {
        log.info("here:{}", searchHistory.toString());
        return searchHistoryRepository.save(searchHistory);
    }

    @Override
    public Flux<SearchHistory> findAll() {
        return searchHistoryRepository.findAll();
    }
}
