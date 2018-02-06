package com.iot.spring.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iot.spring.dao.UserDAO;
import com.iot.spring.vo.Emp;
import com.iot.spring.vo.UserInfo;
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
	public int UserInsert() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int UserDelete() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int UserUpdate() {
		// TODO Auto-generated method stub
		return 0;
	}

}