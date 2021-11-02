package com.REST.REST_TEST.ex01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	MemberVO vo;
	
	@RequestMapping("/member")
	public MemberVO member() {
		vo.setId("sin");
		vo.setPwd("1234");
		vo.setName("½Å½Â¹Ì");
		vo.setEmail("sin@test.com");
		
		return vo;
	}
}
