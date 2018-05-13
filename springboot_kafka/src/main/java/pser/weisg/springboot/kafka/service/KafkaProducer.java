package pser.weisg.springboot.kafka.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @Description: 生产者
 * @author WEISANGNG
 * @date 2018年3月10日
 */
@Service
public class KafkaProducer {
	@Autowired
	private KafkaTemplate kafkaTemplate;

	/**
	 * 发送消息到kafka,主题为test
	 */
	public void sendTest(){
        kafkaTemplate.send("test","hello,kafka  "  + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")));
    }
}
