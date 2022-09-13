package com.cloud.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cloud.repository.BoardVO;
import com.cloud.service.BoardService;

@Controller
public class BoardController {
	
	
	
	@Autowired
	private BoardService service;	//���� ��ü ����
	
	@RequestMapping(value="/boardList", method=RequestMethod.GET)
	public String getBoardList(Model model) {
		List<BoardVO> boardList = service.getBoardList();
		model.addAttribute("boardList", boardList);	//jsp������ ����Ʈ�� ����
		return "boardList";
	}
	
	@RequestMapping(value="/insertBoard", method=RequestMethod.GET)
	public String insertBoardView() {	//�۾��� �� ������ ��û
		return "insertBoard";
	}
	
	@RequestMapping(value="/insertBoard", method=RequestMethod.POST)
	public String insertBoard(BoardVO vo) {	//�۾��� �� ������ ��û
		//�Ķ������ ��ü�� Ŀ�ǵ� ��ü��� �� (�� �����͸� ���޹ް� ����)
		service.insertBoard(vo);
		return "redirect:boardList";
	}
	
	/*@RequestMapping(value="/insertBoard", method=RequestMethod.POST)
	public String insertBoard(HttpServletRequest request) throws UnsupportedEncodingException {
		//����� �Է� ���� ����
		request.setCharacterEncoding("utf-8");	//�ѱ� ���ڵ� ��û
		
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		
		//db����
		BoardVO vo = new BoardVO();
		
		vo.setTitle(title);
		vo.setWriter(writer);
		vo.setContent(content);
		
		service.insertBoard(vo);
		return "redirect:boardList";
	}*/
	
	@GetMapping("/boardView")
	public String boardView(int bno, Model model) {//�󼼺��� ������ ��û
		BoardVO board = service.getBoard(bno);
		service.updateCount(bno);
		model.addAttribute("board",board);	//jsp�� board ������ ����
		return "boardView";
	}
	
	//�� ����
	@GetMapping("/deleteBoard")
	public String deleteBoard(BoardVO vo) {	//�� ���� ó�� ��û
		service.deleteBoard(vo);
		return "redirect:boardList";
	}
	
	@PostMapping("/updateBoard")
	public String updateBoard(BoardVO vo) {	//�� ���� ��û
		service.updateBoard(vo);
		return "redirect:boardList";
	}
}
