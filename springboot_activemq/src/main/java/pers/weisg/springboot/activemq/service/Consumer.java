package pers.weisg.springboot.activemq.service;

import org.springframework.stereotype.Service;

/**
 * @Description: 消息消费者
 * @author WEISANGNG
 * @date 2018年3月4日
 */
@Service
public class Consumer {
	
	/*@JmsListener(destination = "weisg.queue")
    public void receiveQueue(String consumer) {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(consumer+"消息已经消费了");  
    }*/ 
}
