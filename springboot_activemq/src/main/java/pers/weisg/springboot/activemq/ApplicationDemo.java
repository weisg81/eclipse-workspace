package pers.weisg.springboot.activemq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationDemo {
	
	protected static Logger logger=LoggerFactory.getLogger(ApplicationDemo.class); 

	public static void main(String[] args) {
		SpringApplication.run(ApplicationDemo.class, args);
		logger.info("SpringBoot Start Success");
	}
}
