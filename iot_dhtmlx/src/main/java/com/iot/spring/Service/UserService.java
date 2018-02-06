package com.iot.spring.Service;

import java.util.List;

import com.iot.spring.vo.UserInfo;



public interface UserService {

	public List<UserInfo> getUserList();
	public int insertUser();
	public int deleteUser();
	public int updateUser();
	
}
