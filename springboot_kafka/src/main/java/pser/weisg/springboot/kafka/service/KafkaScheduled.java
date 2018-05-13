package pser.weisg.springboot.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @Description: TODO(用一句话描述该文件做什么)
 * @author WEISANGNG
 * @date 2018年3月10日
 */
@Service
public class KafkaScheduled {
	private static Logger logger = LoggerFactory.getLogger(KafkaScheduled.class);
	@Autowired
    private KafkaProducer kafkaSender;
	// 然后每隔1分钟执行一次
	@Scheduled(fixedRate = 1000 * 20)
	public void testKafka() throws Exception {
		logger.info("KafkaScheduled...start");
		kafkaSender.sendTest();
	}
}
