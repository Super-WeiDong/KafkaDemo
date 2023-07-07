package com.example.kafka;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaApplication {

	public static void main(String[] args) {

		SpringApplication.run(KafkaApplication.class, args);
	}

	//In the context of Java and Spring Boot
	//a CommandLineRunner is an interface that allows you to run specific code
	//after the Spring Boot application has started up.
	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String,String> kafkaTemplate){
		return args ->{
			for(int i=0;i<1000000;i++)
			kafkaTemplate.send("dream","A bad korean guy punch me "+i+" times :)");
		};
	}

}
