package com.iot.spring.Service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.spring.Service.EmpService;
import com.iot.spring.controller.EmpController;
import com.iot.spring.dao.EmpDAO;
import com.iot.spring.vo.Emp;

@Service
public class EmpServicImpl implements EmpService {

	@Autowired
	private EmpDAO edao;
	@Override
	public List<Emp> getEmpList() {
		
		return edao.selectEmpList();
	}

	@Autowired
	EmpController ec;
	@Override
	public Emp getEmp() {
		
		
		return null;
	}

	@Override
	public int insertEmp(Map<String,Object> map) {
		
		
		return edao.insertEmp(map);
	}

	@Override
	public int deleteEmp(Map<String,Object> map) {
		
		return edao.deleteEmp(map);
	}

	@Override
	public int updateEmp(Map<String,Object> map) {
		
		return edao.updateEmp(map);
	}

}
