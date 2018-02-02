package com.iot.spring.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iot.spring.Service.EmpService;
import com.iot.spring.vo.Emp;

@Controller
@RequestMapping("/emp")
public class EmpContoller {
	private static final Logger logger = LoggerFactory.getLogger(EmpContoller.class);
	@Autowired
	private EmpService es;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String getEmpList(Model m) {
		List<Emp> empList = es.getEmpList();
		m.addAttribute("empList", empList);
		return "emp/jstl_list";

	}

	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insertEmp(@Valid Emp empDTO, Errors er, Model m) {
		if (er.hasErrors()) {
			logger.info("error=>{}",es);
			m.addAttribute("errorMsg", er.getAllErrors());
			return "error/error";
		}
		logger.info("insert result=>{}",empDTO);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("empName", empDTO.getEmpName());
		map.put("empSal", empDTO.getEmpSal());
		es.insertEmp(map);
		return "emp/write";
	}
}
