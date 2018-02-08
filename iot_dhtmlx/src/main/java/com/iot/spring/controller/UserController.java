package com.iot.spring.controller;

import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;
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
	
}
