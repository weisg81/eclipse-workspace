package pers.weisg.springboot.activemq.service;

import java.io.Serializable;

import javax.annotation.Resource;
import javax.jms.Queue;
import javax.jms.Topic;

import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

/** 
 * @Description: 用户消息生产者
 * @author WEISANGNG   
 * @date 2018年3月4日   
 */
@Service("userProducer")
public class UserProducer {
	
	@Resource
	private JmsMessagingTemplate jmsMessagingTemplate;
	
	@Resource
	private Queue userQueue;
	@Resource
	private Queue queue;
	@Resource
	private Topic topic;
	

	public void sendData(Serializable obj) {
        this.jmsMessagingTemplate.convertAndSend(userQueue,obj);
    }
	public void sendMessage(String message) {
		this.jmsMessagingTemplate.convertAndSend(queue,message);
	}
	
	public void sendTopicMessage(String message) {
		this.jmsMessagingTemplate.convertAndSend(topic,message);
	}
}
