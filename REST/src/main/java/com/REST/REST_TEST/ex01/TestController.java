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
		vo.setName("신승미");   //git에 업로드시 한글 깨짐이 발생한다면 프로젝트 Resource의 인코딩 타입 UTF-8로 변경
		vo.setEmail("sin@test.com");
		
		return vo;
	}
}
