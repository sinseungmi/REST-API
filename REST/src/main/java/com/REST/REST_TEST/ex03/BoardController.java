package com.REST.REST_TEST.ex03;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/boards")
@Log4j
public class BoardController {
									//get방식으로 요청하기 때문에 모든 글의 정보를 조회
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity<List<ArticleVO>> listArticles(){
		log.info("list 메서드 호출");
		List<ArticleVO> list = new ArrayList<ArticleVO>();
		
		for (int i = 0; i < 10; i++) {
			ArticleVO vo = new ArticleVO();
			vo.setArticleNO(i);
			vo.setWriter("이순신" + i);
			vo.setTitle("안녕하세요" + i);
			vo.setContent("새 상품을 소개합니다." + i);
			list.add(vo);
		}
		return new ResponseEntity<List<ArticleVO>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{articleNO}", method = RequestMethod.GET)
	public ResponseEntity<ArticleVO> findArticle(@PathVariable("articleNO") Integer articleNO) {
		log.info("find 메서드 호출");
		
		ArticleVO vo = new ArticleVO();
		vo.setArticleNO(articleNO);
		vo.setWriter("신승미");
		vo.setTitle("안녕");
		vo.setContent("신승미의 글입니다");
		
		return new ResponseEntity<ArticleVO>(vo, HttpStatus.OK);
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	//클라이언트에서 서버로 필요한 데이터를 요청하기 위해 JSON 데이터를 요청 본문에 담아서 서버로 보내면, 
	//서버에서는 @RequestBody 어노테이션을 사용하여 HTTP 요청 본문에 담긴 값들을 자바객체로 변환시켜, 객체에 저장한다.
	public ResponseEntity<String> addArticle(@RequestBody ArticleVO articleVO) {
		ResponseEntity<String> resEntity = null;
		
		try {
			log.info("add 메서드 호출");
			log.info(articleVO.toString());
			resEntity = new ResponseEntity<String>("ADD_SUCCEEDED", HttpStatus.OK);
		} catch (Exception e) {
			resEntity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		return resEntity;
		
	}
 
}







