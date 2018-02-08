package com.iot.spring.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iot.spring.dao.ConnectionDAO;
import com.iot.spring.vo.ColumnVO;
import com.iot.spring.vo.ConnectionInfoVO;
import com.iot.spring.vo.Emp;
import com.iot.spring.vo.TableVO;

@Repository
public class ConnectionDAOImpl implements ConnectionDAO {
	@Autowired
	private SqlSessionFactory ssf;

	@Override
	public List<ConnectionInfoVO> selectEmpList() {
		SqlSession ss = ssf.openSession();
		List<ConnectionInfoVO> empList = ss.selectList("Connection.selectConnection");
		return empList;
	}

	@Override
	public ConnectionInfoVO selectEmp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertConnection(ConnectionInfoVO ci) {
		SqlSession ss = ssf.openSession();
		int insert = ss.insert("Connection.insertConnection", ci);
		return insert;
	}

	@Override
	public int deleteConnection() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateConnection() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Map<String, Object>> selectDatabaseList() {
		SqlSession ss = ssf.openSession();

		List<Map<String, Object>> list = ss.selectList("Connection.selectDatabase");
		ss.close();
		return list;
	}

	@Override
	public List<TableVO> selectTableList(String dbName) {

		List<TableVO> tableList = null;
		final SqlSession ss = ssf.openSession();
		tableList = ss.selectList("Connection.selectTable",dbName);
		ss.close();
		return tableList;
	}

	@Override
	public List<ColumnVO> selectColumnList(String cName) {
		List<ColumnVO> columnList = null;
		final SqlSession ss = ssf.openSession();
		columnList = ss.selectList("Connection.selectColumn",cName);
		ss.close();
		return columnList;
	}

}
