package com.cloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/ajax/*")
@Controller
public class AjaxController {
	
	@GetMapping("/jquery1")
	public void query1View() {
	
	}
	
	//��� ������ ��û
	@GetMapping("/calc")
	public String calcView() {
		return "/ajax/calc";
	}
	
	//��� ó��
	@RequestMapping(value="/doPlus", produces = "application/text; charset=utf-8")
	@ResponseBody
	public String doPlus(int num1, int num2) {
		
		int sum = num1+num2;
		String msg = "���ϱ⿡ �����߽��ϴ�";
		return sum + "/" + msg;
	}
	
}
