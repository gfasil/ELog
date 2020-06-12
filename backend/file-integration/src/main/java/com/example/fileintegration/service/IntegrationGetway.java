package com.example.fileintegration.service;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway
public interface IntegrationGetway {

@Gateway(requestChannel = "integration.gateway.channel")
    public String sendMessage(String name);

    @Gateway(requestChannel = "integration.student.channel")
    public String sendMessageToStudent(String name);

}
