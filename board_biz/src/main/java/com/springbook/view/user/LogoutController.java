package com.springbook.view.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogoutController {

	@RequestMapping(value="/logout.do")
	public String logOut(HttpSession session) {
		session.invalidate();
		return "login.jsp";
	}
	
}
