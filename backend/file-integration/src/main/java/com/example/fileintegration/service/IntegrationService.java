package com.example.fileintegration.service;


import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessagingException;
import org.springframework.stereotype.Component;

@Component
public class IntegrationService {

    @ServiceActivator(inputChannel = "integration.gateway.channel")
    public void sendMessage(Message<String> message) throws MessagingException{
        MessageChannel  messageChannel= (MessageChannel) message.getHeaders().getReplyChannel();
        MessageBuilder.fromMessage(message);
        Message<String> newMessage=MessageBuilder.withPayload("welcome " + message.getPayload() + " spring integration").build();
        messageChannel.send(newMessage);


    }
    @ServiceActivator(inputChannel = "integration.student.channel")
    public void sendMessageToStudent(Message<String> message) throws MessagingException{
        MessageChannel  messageChannel= (MessageChannel) message.getHeaders().getReplyChannel();
        MessageBuilder.fromMessage(message);
        Message<String> newMessage=MessageBuilder.withPayload("welcome student " + message.getPayload() + " spring integration").build();
        messageChannel.send(newMessage);


    }
}
