package net.cloud.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.log4j.Log4j;
import net.cloud.domain.SampleVO;

@Log4j
@RequestMapping("/sample/*")
@Component
public class SampleController {
	
	@RequestMapping(value="/basic", method= RequestMethod.GET)
	public void basic() {
		log.info("basic get..");
	}
	
	  @GetMapping("/basicGet")
	  public void basicGet() {
	  log.info("basic get only get.."); }
	 
	@GetMapping("/ex01")
	public String ex01(SampleVO vo) {
		log.info(vo);
		return "ex01";
	}
	
	//동일한 이름의 파라미터가 여러개 전달 될 경우
	//@RequestParam - 사용된 변수의 이름과 전달되는 파라미터의 이름이 다른 경우에 사용
 	@GetMapping("/ex02List")
	public String ex02List(@RequestParam("ids") ArrayList<String> ids) {
		log.info("ids: " + ids);
		
		return "ex02List";
	}
 	
 	//ex03.jsp로 리턴하기
 	@GetMapping("/ex03")
 	public String ex03(SampleVO SampleVO, @ModelAttribute("page") int page) {
 		log.info("vo: " + SampleVO);
 		log.info("page: " + page);
 		return "ex03";
 	}
 	
}
