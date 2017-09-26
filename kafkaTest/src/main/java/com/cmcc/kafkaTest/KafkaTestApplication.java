package com.cmcc.kafkaTest;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({ "classpath:spring-context.xml" })
public class KafkaTestApplication {    
	
	public static Logger LOG = Logger.getLogger("KafkaTestApplication"); 
    
	public static void main(String[] args){
		SpringApplication.run(KafkaTestApplication.class, args);
		LOG.info("Started kafkaTestApplication server");
	}

}
