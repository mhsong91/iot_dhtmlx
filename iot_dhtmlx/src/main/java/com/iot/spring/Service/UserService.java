package com.iot.spring.Service;

import java.util.List;

import com.iot.spring.vo.UserInfo;
import com.iot.spring.vo.UserVO;



public interface UserService {

	public List<UserInfo> getUserList();
	public int insertUser(UserVO uv);
	public int deleteUser();
	public int updateUser();
	
}
