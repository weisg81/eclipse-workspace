package pser.weisg.springboot.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


/** 
 * @Description: 启动入口
 * @author WEISANGNG   
 * @date 2018年3月10日   
 */
@SpringBootApplication
@EnableScheduling
public class KafkaApplication {

	protected static Logger logger=LoggerFactory.getLogger(KafkaApplication.class); 

	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);
		logger.info("----------------SpringBoot Start Success-------------------");
	}
}
