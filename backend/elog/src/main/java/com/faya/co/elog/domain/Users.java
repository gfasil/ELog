package com.faya.co.elog.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDate;

@Document
public class Users {
    @MongoId
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
