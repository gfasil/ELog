package com.faya.co.elog.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_NULL) // used for ignoring nulls when we configure the dto
public class ErrorDto {
    private Long id;
    private String name;
    private List<String> tags;
    private List<Long> solutionsId;
    private String cause;
    private String message;
    private String description;
    private String severity;
}
