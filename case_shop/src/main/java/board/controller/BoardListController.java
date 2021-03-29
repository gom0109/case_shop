package board.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import board.model.BoardBean;
import board.model.BoardDao;



@Controller
public class BoardListController {
	private final String COMMAND_LIST = "/list.br";
	private final String COMMAND_READ = "/read.br";
	private final String GETPAGE_LIST = "list";
	private final String GETPAGE_READ = "read";

	
	@Autowired
	private BoardDao boardDao;
	
	@RequestMapping(value=COMMAND_LIST)
	public String doAction(Model model, HttpSession session) {
		List<BoardBean> boardList = boardDao.getList();
		model.addAttribute("boardList", boardList);
		
		return GETPAGE_LIST;		
	}
	
	@RequestMapping(value=COMMAND_READ)
	public String doAction(Model model, int boardNum) {
		BoardBean board = boardDao.getOne(boardNum);
		model.addAttribute("board", board);

		return GETPAGE_READ;		
	}
	
	@RequestMapping(value="getSession")
	public String getSession(HttpSession session) {
		session.setAttribute("memberNum", 1);
		session.setAttribute("name", "ȫ�浿");		

		return "redirect:"+COMMAND_LIST;		
	}
	
	@RequestMapping(value="removeSession")
	public String removeSession(HttpSession session) {
		session.invalidate();
		return "redirect:"+COMMAND_LIST;		
	}

}

