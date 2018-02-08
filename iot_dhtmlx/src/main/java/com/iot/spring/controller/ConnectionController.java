package com.iot.spring.controller;

import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iot.spring.Service.ConnectionService;
import com.iot.spring.vo.ColumnVO;
import com.iot.spring.vo.ConnectionInfoVO;
import com.iot.spring.vo.TableVO;

@Controller
@RequestMapping("/connection")
public class ConnectionController {
	@Autowired
	private ConnectionService cs;
	ObjectMapper om = new ObjectMapper();

	// @RequestMapping(value = "/select", method = RequestMethod.GET)
	// public @ResponseBody List getConnectionList(List list,Model m) {
	// List<ConnectionInfoVO> connectionList = cs.getConnectionList();
	// m.addAttribute("ConnectionList", connectionList);
	// return "";
	// }
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public @ResponseBody Map insertConnection(@RequestParam Map map) {
		ConnectionInfoVO ci = om.convertValue(map, ConnectionInfoVO.class);// convertValue=>리플렉션으로 vo에 있는 set메소드 자동실행

		String resultStr = "";
		int result = cs.insertConnection(ci);
		if (result >= 1) {
			resultStr = "입력성공";
		} else {
			resultStr = "입력실패";
		}
		map.put("msg", resultStr);

		return map;
	}

	@RequestMapping(value = "/db_list", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> getDatabaseList(Map<String, Object> map) {
		List<Map<String, Object>> list = cs.getDatabaseList();
		map.put("dbList", list);

		return map;
	}

	@RequestMapping(value = "/columns/{cName}", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> getColumnsList(@PathVariable("cName") String cName,
			Map<String, Object> map) {
		List<ColumnVO> columnList = cs.getColumnList(cName);
		map.put("dblist",columnList);

		return map;
	}

	@RequestMapping(value = "/tables/{dbName}", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> getTablesList(@PathVariable("dbName") String dbName,
			Map<String, Object> map) {
		List<TableVO> tablelist = cs.getTableList(dbName);
		map.put("tablelist", tablelist);

		return map;
	}

}
