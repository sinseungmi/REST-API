package com.REST.REST_TEST.ex01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j;

@Log4j
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
	
	@RequestMapping("/list")
	public List<MemberVO> listMembers() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		for (int i = 0; i < 10; i++) {
			MemberVO mem = new MemberVO();
			mem.setId("sin" + i);
			mem.setPwd("123" + i);
			mem.setName("신승미" + i);
			mem.setEmail(String.format("sin%s@test.com", i));		
			list.add(mem);
		}
		
		return list;
	}
	
	@RequestMapping("/map")
	public Map<Integer, MemberVO> membersMap() {
		Map<Integer, MemberVO> map = new HashMap<Integer, MemberVO>();
		for (int i = 0; i < 10; i++) {
			MemberVO mem = new MemberVO();
			mem.setId("sin" + i);
			mem.setPwd("123" + i);
			mem.setName("신승미" + i);
			mem.setEmail(String.format("sin%s@test.com", i));		
			map.put(i, mem);
		}
		
		return map;
	}
	
	@GetMapping("/notice/{num}")    //@PathVariable을 사용하면 요청 URL로 전달된 매개변수를 가져올 수 있다.
	public int notice(@PathVariable("num") int num) {
		return num;
	}
	
	@PostMapping("/info")
	public void modify(@RequestBody MemberVO vo) {
		log.info(vo.toString());
	}
	
	@RequestMapping("/mem2")
	public ResponseEntity<List<MemberVO>> members2() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		for (int i = 0; i < 10; i++) {
			MemberVO mem = new MemberVO();
			mem.setId("abc" + i);
			mem.setName("이름" + i);
			mem.setPwd("pass" + i);
			mem.setEmail(String.format("abc%s@naver.com", i));
			list.add(mem);
		}
		return new ResponseEntity(list, HttpStatus.INTERNAL_SERVER_ERROR);
		                         //객체와 오류 코드 500을 응답
	}
	
	@RequestMapping("/res3")
	public ResponseEntity res3() {
		HttpHeaders reh = new HttpHeaders();
		reh.add("Content-Type", "text/html; charset=utf-8");   
		String message = "<script> alert('새 회원을 등록'); location.href='mem2'; </script>";
											    //location.href를 'mem2'로 해야하는 이유는?
												//'/REST_TEST/test/mem2'로 했을 때는 /REST_TEST/test가 두번 나옴
		                                        //왜냐하면 '/res3'랑 같은 /REST_TEST/test안에 있기 때문! 
												//'/mem2'이렇게 하면 최상위에 있는 mem2을 찾는 것! 
		return new ResponseEntity(message, reh, HttpStatus.CREATED);
	}

}








