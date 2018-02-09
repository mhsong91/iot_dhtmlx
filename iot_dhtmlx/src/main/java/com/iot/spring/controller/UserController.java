package com.iot.spring.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iot.spring.Service.UserService;
import com.iot.spring.vo.UserVO;
@Controller
@RequestMapping("/user")
public class UserController {
@Autowired
UserService us;

ObjectMapper om = new ObjectMapper();
private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@RequestMapping(value ="/login", method = RequestMethod.POST)
	public @ResponseBody Map<String,Object> login(@Valid UserVO ui,HttpSession hs){//벨리드는 자동으로 vo에들가는데 스트링이나 int가다르면 오류가난다
		Map<String,Object> map=new HashMap<String,Object>();
		logger.info("Before Login HttpSession=>{}",hs.getAttribute("user"));
		hs.setAttribute("user",ui);
		hs.setAttribute("isLogin",true);
		logger.info("Before Login HttpSession=>{}",hs.getAttribute("user"));
		ui=us.getUserVO(ui);
		map.put("resurt",false);
		map.put("msg","로그인실패");
		if(ui!=null) {
			hs.setAttribute("user",ui);
			hs.setAttribute("isLogin",true);
		map.put("msg","로그인성공");
		map.put("loginOk", true);
		}
		return map;
	}
	@RequestMapping(value ="/signup", method = RequestMethod.POST)
	public @ResponseBody Map<String,Object> signup(@Valid UserVO ui,HttpSession hs){//벨리드는 자동으로 vo에들가는데 스트링이나 int가다르면 오류가난다
		Map<String,Object> map=new HashMap<String,Object>();
		us.inserUser(map, ui);
		
		return map;
	}
	@RequestMapping(value="/list" ,method = RequestMethod.GET)
	public @ResponseBody List<UserVO> list(UserVO uv){
		List<UserVO> userlist=us.selectlist(uv);
		
		return userlist;
	}
	
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public @ResponseBody Map insertuser(@RequestParam Map map) {
		UserVO uv = om.convertValue(map, UserVO.class);// convertValue=>리플렉션으로 vo에 있는 set메소드 자동실행

		String resultStr = "";
		int result = us.insertUser(uv);
		if (result >= 1) {
			resultStr = "입력성공";
		} else {
			resultStr = "입력실패";
		}
		map.put("msg", resultStr);

		return map;
	}
	@RequestMapping(value="/delete", method = RequestMethod.POST)
	public @ResponseBody Map<String,Object> deleteUser(@RequestParam Map map){
		
		String resultStr="";
		int result = us.deleteUser(map);

		if (result >= 1) {
			resultStr = "삭제성공";
		} else {
			resultStr = "삭제실패";
		}
		map.put("msg", resultStr);
		
		return map;
	}
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public @ResponseBody Map<String,Object> updateUser(@RequestParam Map map){
		System.out.println(map+"                         ??");
		String resultStr="";
		int result = us.updateUser(map);

		if (result >= 1) {
			resultStr = "수정성공";
		} else {
			resultStr = "수정실패";
		}
		map.put("msg", resultStr);
		
		return map;
	}
	
}
