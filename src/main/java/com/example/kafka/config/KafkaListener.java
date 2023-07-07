package com.example.kafka.config;

import org.springframework.stereotype.Component;

@Component
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(topics ="dream",groupId = "groupId")
    public void listener(String data){
        System.out.println("Listener received data " + data + " !!!");
    }
}
