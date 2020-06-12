package com.faya.co.elog;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ElogApplication {

    @Value("${spring.message}")
    private String message;
    @GetMapping(value = "")
    public String main(){
        return message;}
    public static void main(String[] args) {
        SpringApplication.run(ElogApplication.class, args);
    }

}
