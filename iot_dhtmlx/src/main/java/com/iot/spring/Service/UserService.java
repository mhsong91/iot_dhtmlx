package com.iot.spring.Service;

import java.util.List;
import java.util.Map;

import com.iot.spring.vo.UserInfo;
import com.iot.spring.vo.UserVO;



public interface UserService {
	public UserVO getUserVO(UserVO ui);
	public List<UserInfo> getUserList();
	public int insertUser(UserVO uv);
	public int deleteUser(Map<String,Object> map);
	public int updateUser(Map<String,Object> map);
	void inserUser(Map<String,Object> map,UserVO ui);
	 List<UserVO> selectlist( UserVO uv);
	
}
