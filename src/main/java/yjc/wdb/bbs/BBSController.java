package yjc.wdb.bbs;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import yjc.wdb.bbs.bean.Board;
import yjc.wdb.bbs.dao.BoardDAO;

@Controller
public class BBSController {
	
	@Inject
	private BoardDAO dao;
	
	
	@RequestMapping(value="create")
	public String create(Board board) throws Exception {
//		... 처리하고 => dao.insert(board);
		
		dao.create(board);
		return "result";
	}
}
