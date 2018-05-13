package pser.weisg.springboot.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/** 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author WEISANGNG   
 * @date 2018年3月10日   
 */
@Service
public class KafkaConsumer {
	protected static Logger logger=LoggerFactory.getLogger(KafkaConsumer.class); 
	/**
     * 监听test主题,有消息就读取
     * @param message
     */
    @KafkaListener(topics = {"test"})
    public void consumer(String message){
    	logger.info("test topic message : {}", message);
    }
}
