package pers.weisg.springboot.activemq.service;

import javax.annotation.Resource;
import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

/**
 * @Description: 消息生产者
 * @author WEISANGNG
 * @date 2018年3月4日
 */
@Service("scheduleProducer")
@EnableScheduling
public class ScheduleProducer {

	@Resource
	private JmsMessagingTemplate jmsMessagingTemplate;
	
	@Autowired  
    private Queue queue;

	/*@Scheduled(fixedDelay = 200000000) // 每2s执行1次
	public void send() {
		this.jmsMessagingTemplate.convertAndSend(this.queue, "hello,activeMQ");
		try {
			System.out.println("已经生产了"+this.queue.getQueueName());
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
}
