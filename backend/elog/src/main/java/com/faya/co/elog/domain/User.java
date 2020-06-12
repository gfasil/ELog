package com.faya.co.elog.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
