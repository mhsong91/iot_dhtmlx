package com.iot.spring.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.spring.Service.UserService;
import com.iot.spring.dao.UserDAO;
import com.iot.spring.vo.UserInfo;
import com.iot.spring.vo.UserVO;
@Service
public class UserServicImpl implements UserService{
	@Autowired
	private UserDAO udao;
	
	@Override
	public List<UserInfo> getUserList() {
		
		return udao.selectUserList();
	}

	@Override
	public int insertUser(UserVO uv) {
		
		return udao.UserInsert(uv);
	}

	@Override
	public int deleteUser() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUser() {
		// TODO Auto-generated method stub
		return 0;
	}

}
