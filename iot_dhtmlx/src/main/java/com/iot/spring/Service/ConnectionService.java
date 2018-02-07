package com.iot.spring.Service;

import java.util.List;
import java.util.Map;

import com.iot.spring.vo.ConnectionInfoVO;

public interface ConnectionService {
	public List<ConnectionInfoVO> getConnectionList();
	public ConnectionInfoVO getConnection();
	public int insertConnection(ConnectionInfoVO ci);
	public int deleteConnection();
	public int updateConnection();
}
