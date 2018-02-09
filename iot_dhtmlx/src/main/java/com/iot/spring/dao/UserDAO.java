package com.iot.spring.dao;

import java.util.List;
import java.util.Map;

import com.iot.spring.vo.UserInfo;
import com.iot.spring.vo.UserVO;

public interface UserDAO {
	public List<UserInfo> selectUserList();
	public int UserInsert(UserVO uv);
	public int UserDelete(Map<String,Object> map);
	public int UserUpdate(Map<String,Object> map);

}
