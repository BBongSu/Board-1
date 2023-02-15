package com.example.board1.board;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.board1.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;

	@RequestMapping(value="/")
	public String main(Model model){
		List<HashMap<String, Object>> result = boardService.boardList();
		model.addAttribute("result",result);
		return "main";
	}
}
