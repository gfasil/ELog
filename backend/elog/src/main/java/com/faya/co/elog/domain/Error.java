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
public class Error {
    @MongoId
    private Long id;
    private String name;
    private List<String> tags;
    private List<Solution> solutions;
    private String cause;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private Users user;
    private String message;
    private String description;
    enum SEVERITY{ONE,TWO,THREE};
    private SEVERITY severity;

}
