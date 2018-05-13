package pers.weisg.ssm.user.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pers.weisg.ssm.user.dto.UserDto;

@Controller
public class UserController {

	@ResponseBody
	@RequestMapping("/first")
	public Map<String, Object> first() throws Exception {
		Map<String, Object> retMap = new HashMap<String, Object>();
		retMap.put("key1", "value1");
		retMap.put("key2", "value2");
		retMap.put("key3", "value3");
		return retMap;
	}
	
	@ResponseBody
	@RequestMapping(value="/hello.do")
	public Map<String, Object> hello(Map<String, String> params){
		System.out.println("-------hello----------");
		Map<String, Object> retData = new HashMap<String, Object>();
		retData.put("responseCode", "000000");
		retData.put("responseMsg", "success");
		retData.putAll(params);
		return retData;
	}
	
	@ResponseBody
	@RequestMapping(value="/hello2.do")
	public Map<String, Object> hello2( UserDto userDto){
		System.out.println("----------hello2-------");
		Map<String, Object> retData = new HashMap<String, Object>();
		retData.put("responseCode", "000000");
		retData.put("responseMsg", "success");
		
		return retData;
	}
}
