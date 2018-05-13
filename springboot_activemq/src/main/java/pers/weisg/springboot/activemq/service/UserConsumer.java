package pers.weisg.springboot.activemq.service;

import javax.jms.JMSException;
import javax.jms.ObjectMessage;

import org.springframework.beans.BeanUtils;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import pers.weisg.springboot.activemq.entity.User;

/**
 * @Description: TODO(用一句话描述该文件做什么)
 * @author WEISANGNG
 * @date 2018年3月4日
 */
@Service
public class UserConsumer {
	@JmsListener(destination = "userMqQueue",containerFactory = "jmsListenerContainerQueue")
	public void receive(ObjectMessage message) throws JMSException {
		System.out.println("----------UserConsumer-----------"+message);
		System.out.println("----------message-----------"+message.getObject());
		User user = new User();
		
		BeanUtils.copyProperties(message.getObject(), user);
		
		System.out.println("user--------------"+user);
		System.out.println("user数据数据完成...");
	}
	
	@JmsListener(destination = "weisg.topic",containerFactory = "jmsListenerContainerTopic")
	public void receiveTopicMessage(String message) throws JMSException {
		System.out.println("receiveTopicMessage--------------"+message);
	}
	
	@JmsListener(destination = "weisg.topic",containerFactory = "jmsListenerContainerTopic")
	public void receiveTopicMessage2(String message) throws JMSException {
		System.out.println("receiveTopicMessage2--------------"+message);
	}
}
