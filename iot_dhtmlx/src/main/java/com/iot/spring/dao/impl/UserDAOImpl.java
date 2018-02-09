package com.iot.spring.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iot.spring.dao.UserDAO;
import com.iot.spring.vo.UserInfo;
import com.iot.spring.vo.UserVO;
@Repository
public class UserDAOImpl implements UserDAO{
	@Autowired
	private SqlSessionFactory ssf;
		
	@Override
	public List<UserInfo> selectUserList() {
		SqlSession ss=ssf.openSession();
		List<UserInfo> userList= ss.selectList("user.selectUser");
		return userList;
	}

	@Override
	public int UserInsert(UserVO uv) {
		SqlSession ss=ssf.openSession();
		int insert = ss.insert("user.insertUser",uv);
		return insert;
	}

	@Override
	public int UserDelete(Map<String,Object> map) {
		SqlSession ss=ssf.openSession();
		int delete=ss.delete("user.deleteUser",map);
		return delete;
	}

	@Override
	public int UserUpdate(Map<String,Object> map) {
		SqlSession ss=ssf.openSession();
		int update=ss.update("user.updateUser",map);
		return update;
	}

}
