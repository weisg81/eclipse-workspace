package pers.weisg.site.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import pers.weisg.site.interceptor.MyInterceptor;

/** 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author WEISANGNG   
 * @date 2018年5月13日   
 */
@Configuration
public class MyMvcConfig extends WebMvcConfigurationSupport {
	@Autowired
	private MyInterceptor myInterceptor;
	
	@Override
	protected void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(myInterceptor).addPathPatterns("/**").excludePathPatterns("/a/*");
		super.addInterceptors(registry);
	}
}
