package com.faya.co.elog.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Error {
    private Long id;
    private String name;
    private List<String> tags;
    private List<Solution> solutions;
    private String cause;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private User user;
    private String message;
    private String description;
    enum SEVERITY{ONE,TWO,THREE};
    private SEVERITY severity;

}
