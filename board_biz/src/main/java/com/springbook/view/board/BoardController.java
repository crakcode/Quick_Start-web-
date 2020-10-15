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
	// 글 등록
	@RequestMapping(value = "/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
		boardDAO.insertBoard(vo);
		return "getBoardList.do";
	}

	// 글 수정
	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo, BoardDAO boardDAO) {
		boardDAO.updateBoard(vo);
		return "getBoardList.do";
	}

	// 글 삭제
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {
		boardDAO.deleteBoard(vo);
		return "getBoardList.do";
	}

	// 글 상세 조회
	@RequestMapping("/getBoard.do")
	public ModelAndView getBoard(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		mav.addObject("board", boardDAO.getBoard(vo)); // Model 정보 저장
		mav.setViewName("getBoard.jsp"); // View 정보 저장
		return mav;
	}
	
	@RequestMapping("/getBoardList_an.do")
	public ModelAndView getBoardList_an(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		mav.addObject("boardList", boardDAO.getBoardList(vo)); // Model 정보 저장
		mav.setViewName("getBoardList_an.jsp"); // View 정보 저장
		return mav;
	}

	// 글 목록 검색
	@RequestMapping("/getBoardList.do")
	public ModelAndView getBoardList(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		mav.addObject("boardList", boardDAO.getBoardList(vo)); // Model 정보 저장
		mav.setViewName("getBoardList.jsp"); // View 정보 저장
		return mav;

	}
	
	//RequestParam예시 연습하기
	@RequestMapping("/cheakId.do")
	public String getCheckId (@RequestParam("id") String id,@RequestParam("pw") String pw,Model mo) {
		mo.addAttribute("id",id);
		mo.addAttribute("pw",pw);
		return "checkId.jsp";
	}
	
	
	
	}

