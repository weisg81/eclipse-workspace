package pers.weisg.ssm.common.log4j;

import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.Priority;

public class MyAppender extends DailyRollingFileAppender {

	
	public boolean isAsSevereAsThreshold(Priority priority) {
		 //只判断是否相等，而不判断优先级  
		return this.getThreshold().equals(priority);
	}
}
