package com.iot.spring.dao;

import java.util.List;

import com.iot.spring.vo.UserInfo;

public interface UserDAO {
	public List<UserInfo> selectUserList();
	public int UserInsert();
	public int UserDelete();
	public int UserUpdate();

}
