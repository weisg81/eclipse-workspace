package pers.weisg.springboot.activemq.entity;

import java.io.Serializable;

/** 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author WEISANGNG   
 * @date 2018年2月15日   
 */
public class User implements Serializable{
	
	private static final long serialVersionUID = 1216301644641078413L;
	private String userId;
	private String userName;
	private String userNo;
	private String mobile;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userNo=" + userNo + ", mobile=" + mobile + "]";
	}
	
	
}
