package com.example.fileintegration.config;


import com.example.fileintegration.Transformer.Transformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.dsl.Pollers;
import org.springframework.integration.file.FileReadingMessageSource;
import org.springframework.integration.file.FileWritingMessageHandler;
import org.springframework.messaging.MessageChannel;

import java.io.File;

@EnableIntegration
@Configuration
@IntegrationComponentScan
public class IntegrationConfig {

    @Autowired
    private Transformer transformer;

    @Bean
    MessageChannel recieverChannel(){
        return new DirectChannel(); // point to point channel
    }
    @Bean
    MessageChannel replyChannel(){
    return new DirectChannel();
    }

    @Bean
    public IntegrationFlow integrationFlow(){
        return IntegrationFlows.from(fileReader(),
                                    specification->specification.poller(Pollers.fixedDelay(500))).
                                transform(transformer,"transform").
                handle(fileWriter()).get();
    }

    private FileWritingMessageHandler fileWriter() {
        FileWritingMessageHandler handler=new FileWritingMessageHandler(new File("destination"));
        handler.setExpectReply(false);
        return handler;
    }

    private FileReadingMessageSource fileReader() {
        FileReadingMessageSource fileReadingMessageSource=new FileReadingMessageSource();
        fileReadingMessageSource.setDirectory(new File("source"));
        return fileReadingMessageSource;
    }

}
