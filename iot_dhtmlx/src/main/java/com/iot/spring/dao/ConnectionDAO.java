package com.iot.spring.dao;

import java.util.List;
import java.util.Map;

import com.iot.spring.vo.ConnectionInfoVO;

public interface ConnectionDAO {
	public List<ConnectionInfoVO> selectEmpList();
	public ConnectionInfoVO selectEmp();
	public int insertConnection(ConnectionInfoVO ci);
	public int deleteConnection();
	public int updateConnection();

}
