package com.iot.spring.dao;

import java.util.List;
import java.util.Map;

import com.iot.spring.vo.Emp;

public interface EmpDAO {
	
	public List<Emp> selectEmpList();
	public Emp selectEmp();
	public int insertEmp(Map<String,Object> map);
	public int deleteEmp(Map<String,Object> map);
	public int updateEmp(Map<String,Object> map);

}
