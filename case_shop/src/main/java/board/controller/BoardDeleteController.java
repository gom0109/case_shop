package board.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import board.model.BoardBean;
import board.model.BoardDao;

@Controller
public class BoardDeleteController {
	private final String COMMAND = "/delete.br";
	
	@Autowired
	private BoardDao boardDao;
	
	@RequestMapping(value=COMMAND, method=RequestMethod.GET)
	public String doAction(int boardNum, HttpSession session, RedirectAttributes attributes) {
		
		BoardBean board = boardDao.getOne(boardNum);
		
		if(board==null) {
			attributes.addFlashAttribute("msg", "존재하지 않는 게시글입니다.");
			return "redirect:list.br";
		}
		
		if(session.getAttribute("memberNum")==null) {
			attributes.addFlashAttribute("msg", "로그인을 해주세요.");
			return "redirect:list.br";
		}
		if((Integer) session.getAttribute("memberNum") != board.getMemberNum()) {
			attributes.addFlashAttribute("msg", "삭제 할 권한이 없습니다.");
			return "redirect:list.br";
		}
		
		int cnt = boardDao.remove(boardNum);
		
		return "redirect:/list.br";		
	}
	
}


