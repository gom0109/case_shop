package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import board.model.BoardBean;
import board.model.BoardDao;

@Controller
public class BoardInsertController {
	private final String COMMAND = "/insert.br";
	private final String GETPAGE = "insert";
	
	@Autowired
	private BoardDao boardDao;
	
	@RequestMapping(value=COMMAND, method=RequestMethod.GET)
	public String doAction(Model model, HttpSession session, RedirectAttributes attributes) {
		String name = null;
		int memberNum = 0;
		
		if(session.getAttribute("memberNum") == null) {
			attributes.addFlashAttribute("msg", "로그인을하세요.");
			return "redirect:list.br";
		}
		
//		name = (String) session.getAttribute("name");
//		memberNum = (Integer) session.getAttribute("memberNum");
//		System.out.println(memberNum+":"+name);
		
		return GETPAGE;		
	}
	
	
	@RequestMapping(value=COMMAND, method=RequestMethod.POST)
	public String doAction(BoardBean boardBean, HttpServletRequest request) {
		boardBean.setIp(request.getRemoteAddr());
		System.out.println("-- insert target board bean --");
		System.out.println(boardBean.toString());
		
		int cnt = boardDao.insert(boardBean);
		
		return "redirect:/list.br";		
	}
	
}


