package pers.weisg.ssm.user.dto;

import pers.weisg.ssm.common.dto.BaseDTO;

/** 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author WEISANGNG   
 * @date 2018年3月24日   
 */
public class UserDto extends BaseDTO{

	private static final long serialVersionUID = 743198775625588330L;
	
	private String userName;
	
	private String userId;
	
	private Integer age;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
