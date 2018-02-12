package com.iot.spring.dao;

import java.util.List;
import java.util.Map;

import com.iot.spring.vo.ColumnVO;
import com.iot.spring.vo.ConnectionInfoVO;
import com.iot.spring.vo.TableVO;

public interface ConnectionDAO {
	public List<ConnectionInfoVO> selectEmpList();
	public ConnectionInfoVO selectEmp();
	public int insertConnection(ConnectionInfoVO ci);
	public int deleteConnection();
	public int updateConnection();
	public List<Map<String, Object>> selectDatabaseList(int ciNo) throws Exception;
	public List<ConnectionInfoVO> selectConnectionInfoList(ConnectionInfoVO cvo);
	public List<TableVO> selectTableList(String dbName);
	public List<ColumnVO> selectColumnList(String cName);

}
