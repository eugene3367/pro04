package com.company.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.myapp.dto.FreeDTO;
import com.company.myapp.service.FreeService;

@Controller
@RequestMapping("/free/")
public class FreeController {

	@Autowired
	private FreeService freeService;
	
	@GetMapping("list.do")		//free/list.do
	public String getfreeList(Model model) throws Exception {
		List<FreeDTO> freeList = freeService.freeList(); 
		model.addAttribute("freeList", freeList);
		return "free/freeList";
	}
}
