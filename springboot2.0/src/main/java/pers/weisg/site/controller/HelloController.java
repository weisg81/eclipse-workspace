package pers.weisg.site.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import pers.weisg.site.entity.User;

/** 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author WEISANGNG   
 * @date 2018年2月15日   
 */
@RestController
public class HelloController {
	
	//@Autowired
	
	
	@RequestMapping(value="/admin/sayHello",method = RequestMethod.POST)
	public Map<String, Object> sayHello(@RequestParam Map<String, Object> params){
		Map<String, Object> retMap = new HashMap<String, Object>();
		retMap.put("key1", "values1");
		retMap.putAll(params);
		return retMap;
	}
	
	@RequestMapping(value="/admin/beetl",method = RequestMethod.POST)
	public ModelAndView beetl(@RequestParam Map<String, Object> params){
		ModelAndView modelAndView = new ModelAndView();
		User user = new User();
		user.setUserId((String)params.get("userId"));
		user.setUserName((String)params.get("userName"));
		modelAndView.addObject(user);
		modelAndView.setViewName("/userInfo.btl");;
		return modelAndView;
	}
}
