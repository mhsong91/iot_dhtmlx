package com.iot.spring.Service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.spring.Service.EmpService;
import com.iot.spring.controller.EmpContoller;
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
	EmpContoller ec;
	@Override
	public Emp getEmp() {
		
		
		return null;
	}

	@Override
	public int insertEmp(Map<String,Object> map) {
		
		
		return edao.insertEmp(map);
	}

	@Override
	public int deleteEmp() {
		
		return 0;
	}

	@Override
	public int updateEmp() {
		
		return 0;
	}

}
