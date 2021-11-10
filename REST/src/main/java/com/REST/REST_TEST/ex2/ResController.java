package com.REST.REST_TEST.ex2;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResController {
	
	@ResponseBody
	@RequestMapping("res1")
	public Map<String, Object> res1() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", "hong");
		map.put("name", "홍길동");
		return map;
	}
	
	@RequestMapping("/res2")
	public String res2() {
		return "home";
	}
}
