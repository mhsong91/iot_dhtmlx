package com.iot.spring.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iot.spring.dao.EmpDAO;
import com.iot.spring.vo.Emp;


@Repository
public class EmpDAOImpl implements EmpDAO {
	@Autowired
	private SqlSessionFactory ssf;
	
	@Override
	public List<Emp> selectEmpList() {
		SqlSession ss=ssf.openSession();
		List<Emp> empList= ss.selectList("emp.selectEmp");
		return empList;
	}

	@Override
	public Emp selectEmp() {
		
		return null;
	}

	@Override
	public int insertEmp(Map<String,Object> map) {
		SqlSession ss=ssf.openSession();
		 
	
		int insert= ss.insert("emp.insertEmp",map);
		return insert;
	}

	@Override
	public int deleteEmp() {
		
		return 0;
	}

	@Override
	public int updateEmp() {
		
		return 0;
	}

}
