package com.iot.spring.Service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.spring.dao.UserDAO;
import com.iot.spring.Service.UserService;
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
	public int deleteUser(Map<String,Object> map) {
		
		return udao.UserDelete(map);
	}

	@Override
	public int updateUser(Map<String,Object> map) {
		
		return udao.UserUpdate(map);
	}

	@Override
	public UserVO getUserVO(UserVO ui) {
		
		return udao.selectUserVO(ui);
	}

	public boolean isDuplUserInfo(UserVO ui) {
		if(udao.checkUserVO(ui)==1) {
			return true;
		}
		return false;
	}
	
	@Override
	public void inserUser(Map<String,Object> map,UserVO ui) {
		map.put("msg","회원가입실패");
		map.put("signupOk",false);
		if(isDuplUserInfo(ui)) {
			map.put("msg",ui.getUiId()+"는 이미 있어요 다시입력하세요");
			return;
			}
		int result=udao.inserUser(ui);
		
		if(result==1) {
			map.put("msg","회원가입성공");
			map.put("signupOk",true);
		}
		
	}

	@Override
	public List<UserVO> selectlist(UserVO uv) {
		
		return udao.selectlist(uv);
	}

}
