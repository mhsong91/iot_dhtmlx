package com.iot.spring.dao;

import java.util.List;

import com.iot.spring.vo.UserInfo;
import com.iot.spring.vo.UserVO;

public interface UserDAO {
	public List<UserInfo> selectUserList();
	public int UserInsert(UserVO uv);
	public int UserDelete();
	public int UserUpdate();

}
