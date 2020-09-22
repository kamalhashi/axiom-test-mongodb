package com.axion.test.mapper;

import com.axion.test.model.client.HandsetClientResponseDto;
import com.axion.test.model.document.SearchHistory;
import com.axion.test.model.dto.SearchResponseDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SearchHistoryMapper {


    //can be static method
    public SearchHistory mapToDto(int count, String ...keywords) {
        return  SearchHistory.builder()
                .keywords(keywords)
                .count(count)
                .build();
    }

}
