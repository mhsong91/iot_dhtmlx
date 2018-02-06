package com.iot.spring.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.codehaus.jackson.JsonNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.iot.spring.User;
import com.iot.spring.Service.EmpService;
import com.iot.spring.Service.UserService;
import com.iot.spring.dao.NaverTransDAO;
import com.iot.spring.dao.impl.NaverTransDAOImpl;
import com.iot.spring.vo.Emp;
import com.iot.spring.vo.UserInfo;

@Controller
@RequestMapping("/emp")
public class EmpController {
	private static final Logger logger = LoggerFactory.getLogger(EmpController.class);
	@Autowired
	private EmpService es;
	
	@Autowired
	private UserService us;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String getEmpList(Model m) {
		List<Emp> empList = es.getEmpList();
		m.addAttribute("empList", empList);
		return "emp/jstl_list";

	}
	@RequestMapping(value = "/lista", method = RequestMethod.GET)
	public @ResponseBody Map getEmpListAjax(Model m) {
	Map<String, List> map = new HashMap<String, List>();
	List<Emp> empList = es.getEmpList();
	List<UserInfo> userList = us.getUserList();
	map.put("empList", empList);
	map.put("userList",userList);
	return map;

	}

	@RequestMapping(value="/insert",method=RequestMethod.GET)
	   public ModelAndView insertEmp(@Valid Emp empDTO,Errors es,ModelAndView m) throws Exception {
//	      int result = es.insertEmp();
	      if(es.hasErrors()) {
	         logger.info("error=> {}",es);
	         NaverTransDAO nt=new NaverTransDAOImpl();
	         
	         
	         
//	         m.addAttribute("errorMsg",es.getAllErrors());
//	         return "error/error";
	         throw new Exception(es.getAllErrors().get(0).getDefaultMessage());
	      }
//	      logger.info("insert result=> {}",empDTO);
//	      logger.info("insert name=> {}",empDTO.getEmpName());
//	      logger.info("insert sal=> {}",empDTO.getEmpSal());
	      Map<String, Object> map = new HashMap<String, Object>();
	      map.put("empName", empDTO.getEmpName());
	      map.put("empSal", empDTO.getEmpSal());
	      
	      
	      this.es.insertEmp(map);
	      m.setViewName("emp/write");
	      return m;
	   }
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
		
	public String delete(@RequestParam(value="delete") int delete, Model m) {
		 Map<String,Object> map=new HashMap<String,Object>();
		 logger.info("delete num=>{}",delete);
		map.put("empNo", delete);
		es.deleteEmp(map);
			return "emp/delete";
		}
	
 
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	
	public String update(@RequestParam(value="upno") int upno, 
			@RequestParam(value="upname") String upname,
			@RequestParam(value="upsal") int upsal,			
			Model m) {
	 Map<String,Object> map=new HashMap<String,Object>();
		
		map.put("empNo", upno);
		map.put("empName", upname);
		map.put("empSal", upsal);
		es.updateEmp(map);
			return "emp/update";
		}
	
		
	
 
     
	
}
