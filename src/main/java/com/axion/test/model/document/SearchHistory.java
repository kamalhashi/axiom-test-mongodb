package com.axion.test.model.document;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "searchHistory")
@Data
@Builder
public class SearchHistory {
    @Id
    private String _id;
    private String[] keywords;
    private int count;
}
