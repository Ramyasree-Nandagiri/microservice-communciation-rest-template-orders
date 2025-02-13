package com.example.userentity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserEntity {

	@Id
	private Integer UserId;
	public String UserName;
	public String UserAge;
	
	
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId(Integer userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserAge() {
		return UserAge;
	}
	public void setUserAge(String userAge) {
		UserAge = userAge;
	}
	
	
}
