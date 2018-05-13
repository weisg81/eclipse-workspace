package pers.weisg.springboot.activemq.controller;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pers.weisg.springboot.activemq.entity.User;
import pers.weisg.springboot.activemq.service.UserProducer;


/** 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author WEISANGNG   
 * @date 2018年2月15日   
 */
@RestController
public class HelloController {
	
	@Resource
	private UserProducer userProducer;
	
	
	@RequestMapping(value="/admin/sayHello",method = RequestMethod.POST)
	public Map<String, Object> sayHello(@RequestParam Map<String, Object> params){
		Map<String, Object> retMap = new HashMap<String, Object>();
		retMap.put("key1", "values1");
		retMap.putAll(params);
		return retMap;
	}
	
	@RequestMapping(value="/api/addUser",method = RequestMethod.POST)
	public Map<String, Object> beetl(@RequestParam Map<String, Object> params){
		Map<String, Object> retMap = new HashMap<String, Object>();
		User user = new User();
		user.setUserId((String)params.get("userId"));
		user.setUserName((String)params.get("userName"));
		user.setMobile((String)params.get("mobile"));
		userProducer.sendData((Serializable)user);
		userProducer.sendMessage(user.getUserId());
		for (int i = 0; i < 10; i++) {
			userProducer.sendTopicMessage((String)params.get("userId")+i);
		}
		retMap.put("code", "200");
		retMap.put("msg", "success!");
		
		return retMap;
	}
}
