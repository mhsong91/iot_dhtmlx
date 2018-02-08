package com.iot.spring.Service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.spring.Service.ConnectionService;
import com.iot.spring.dao.ConnectionDAO;
import com.iot.spring.vo.ColumnVO;
import com.iot.spring.vo.ConnectionInfoVO;
import com.iot.spring.vo.TableVO;
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

	@Override
	public List<Map<String, Object>> getDatabaseList() {
		List<Map<String, Object>> dbList=cdao.selectDatabaseList();
				int idx=0;
		for(Map<String,Object> mDb:dbList) {
			mDb.put("id",++idx);
			mDb.put("text", mDb.get("Database"));
			mDb.put("items",new Object[] {});
		}
		return dbList;
	}

	@Override
	public List<TableVO> getTableList(String dbName) {
		
		return cdao.selectTableList(dbName);
	}

	@Override
	public List<ColumnVO> getColumnList(String cName) {
		
		return cdao.selectColumnList(cName);
	}

}
