package pser.weisg.springboot.kafka.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/** 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author WEISANGNG   
 * @date 2018年3月10日   
 */
@RestController
public class SampleController {
	private static Logger logger = LoggerFactory.getLogger(SampleController.class);
	@Autowired
    private KafkaTemplate<String, String> template;

	@RequestMapping("/send")
    @ResponseBody
    String send(String topic, String key, String data) {
        return "success";
    }

}
