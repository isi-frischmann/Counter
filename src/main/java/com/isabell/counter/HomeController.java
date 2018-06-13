package com.isabell.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/your_server")
public class HomeController {
	@RequestMapping("")
	public String index(HttpSession session) {
//		System.out.print("homepage");
//		Setting session:
		session.setAttribute("count", 0);
		return "index.jsp";
	}
	
	@RequestMapping("/count")
		public String counter(HttpSession session) {
		Integer temp = (Integer) session.getAttribute("count");
		temp++;
		session.setAttribute("count", temp);
		return "count.jsp";
	}
	
	@RequestMapping("/back")
		public String reset(HttpSession session) {
		session.setAttribute("count", 0);
		return "index.jsp";
	}
	
	@RequestMapping("/addTwo")
		public String addTwo(HttpSession session) {
		System.out.print("HELLLLOOOO");
		Integer addTwo = (Integer) session.getAttribute("count");
		addTwo = addTwo + 2;
		session.setAttribute("count", addTwo);
		return "count.jsp";
	}
}

