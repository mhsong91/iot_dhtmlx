package com.iot.spring.Service;

import java.util.List;
import java.util.Map;

import com.iot.spring.vo.ColumnVO;
import com.iot.spring.vo.ConnectionInfoVO;
import com.iot.spring.vo.TableVO;

public interface ConnectionService {
	public List<ConnectionInfoVO> getConnectionList();
	public ConnectionInfoVO getConnection();
	public int insertConnection(ConnectionInfoVO ci);
	public int deleteConnection();
	public int updateConnection();
	public List<Map<String,Object>> getDatabaseList();
	public List<TableVO> getTableList(String dbName);
	public List<ColumnVO> getColumnList(String cName);
}
