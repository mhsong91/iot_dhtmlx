package com.iot.spring.Service;

import java.util.List;
import java.util.Map;

import com.iot.spring.vo.Emp;

public interface EmpService {
	public List<Emp> getEmpList();
	public Emp getEmp();
	public int insertEmp(Map<String,Object> map);
	public int deleteEmp();
	public int updateEmp();
}
