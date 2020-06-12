package com.faya.co.elog.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Solution {

    private Long id;
    private String sourceUrl;
    private List<String> steps;
    private String description;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
