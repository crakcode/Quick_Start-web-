package com.springbook.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class BoardController {
	// �� ���
	@RequestMapping(value = "/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
		boardDAO.insertBoard(vo);
		return "getBoardList.do";
	}

	// �� ����
	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo, BoardDAO boardDAO) {
		boardDAO.updateBoard(vo);
		return "getBoardList.do";
	}

	// �� ����
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {
		boardDAO.deleteBoard(vo);
		return "getBoardList.do";
	}

	// �� �� ��ȸ
	@RequestMapping("/getBoard.do")
	public ModelAndView getBoard(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		mav.addObject("board", boardDAO.getBoard(vo)); // Model ���� ����
		mav.setViewName("getBoard.jsp"); // View ���� ����
		return mav;
	}
	
	@RequestMapping("/getBoardList_an.do")
	public ModelAndView getBoardList_an(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		mav.addObject("boardList", boardDAO.getBoardList(vo)); // Model ���� ����
		mav.setViewName("getBoardList_an.jsp"); // View ���� ����
		return mav;
	}

	// �� ��� �˻�
	@RequestMapping("/getBoardList.do")
	public ModelAndView getBoardList(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		mav.addObject("boardList", boardDAO.getBoardList(vo)); // Model ���� ����
		mav.setViewName("getBoardList.jsp"); // View ���� ����
		return mav;

	}
	
	//RequestParam���� �����ϱ�
	@RequestMapping("/cheakId.do")
	public String getCheckId (@RequestParam("id") String id,@RequestParam("pw") String pw,Model mo) {
		mo.addAttribute("id",id);
		mo.addAttribute("pw",pw);
		return "checkId.jsp";
	}
	
	
	
	}

