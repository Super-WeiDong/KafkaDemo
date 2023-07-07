package com.example.kafka.config;

import org.springframework.stereotype.Component;

@Component
public class KafkaListener {

    //kafkaListenerContainerFactory refers the type of bean we create in ConsumerConfig
    @org.springframework.kafka.annotation.KafkaListener(topics ="dream",groupId = "groupId", containerFactory = "kafkaListenerContainerFactory")
    public void listener(String data){
        System.out.println("Listener received data " + data + " !!!");
    }
}
