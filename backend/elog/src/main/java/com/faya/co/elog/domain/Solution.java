package com.faya.co.elog.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Solution {
    @MongoId
    private Long id;
    private String sourceUrl;
    private List<String> steps;
    private String description;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
