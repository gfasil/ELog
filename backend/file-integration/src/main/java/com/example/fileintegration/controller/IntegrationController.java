package com.example.fileintegration.controller;

import com.example.fileintegration.service.IntegrationGetway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class IntegrationController {
    @Autowired
    private IntegrationGetway integrationGeteway;

    @GetMapping(value = "{name}")
    public String getMessageFromIntegrationService(@PathVariable(value = "name") String name){

            return integrationGeteway.sendMessage(name);

    }
    @GetMapping(value = "/students/{name}")
    public String getMessageFromIntegrationServiceToStudent(@PathVariable(value = "name") String name){

        return integrationGeteway.sendMessageToStudent(name);

    }
}
