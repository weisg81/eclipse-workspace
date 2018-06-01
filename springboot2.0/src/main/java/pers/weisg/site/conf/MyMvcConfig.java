package pers.weisg.site.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import pers.weisg.site.filter.UserFilter;
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
		//registry.addInterceptor(myInterceptor).addPathPatterns("/**").excludePathPatterns("/a/*");
		super.addInterceptors(registry);
	}
	
	@Bean
    public FilterRegistrationBean testFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        UserFilter userFilter = new UserFilter();
        registration.setFilter(userFilter);//添加过滤器
        registration.addUrlPatterns("/*");//设置过滤路径，/*所有路径
        registration.addInitParameter("name", "alue");//添加默认参数
        registration.setName("userFilter");//设置优先级
        registration.setOrder(1);//设置优先级
        return registration;
    }
	
}
