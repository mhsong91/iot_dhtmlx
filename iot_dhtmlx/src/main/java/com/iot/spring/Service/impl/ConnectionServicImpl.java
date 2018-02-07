package com.iot.spring.Service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.spring.Service.ConnectionService;
import com.iot.spring.dao.ConnectionDAO;
import com.iot.spring.vo.ConnectionInfoVO;
@Service
public class ConnectionServicImpl implements ConnectionService{

	@Autowired
	private ConnectionDAO cdao;
	
	@Override
	public List<ConnectionInfoVO> getConnectionList() {
		
		return cdao.selectEmpList();
	}

	@Override
	public ConnectionInfoVO getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertConnection(ConnectionInfoVO ci) {
		
		return cdao.insertConnection(ci);
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

}
