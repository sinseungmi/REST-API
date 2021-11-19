package com.REST.REST_TEST.ex03;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

}
