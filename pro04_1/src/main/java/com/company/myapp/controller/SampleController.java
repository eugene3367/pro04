package com.company.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.myapp.dto.SampleDTO;
import com.company.myapp.service.SampleService;

@Controller
@RequestMapping("/sample/")
public class SampleController {
	
	@Autowired
	SampleService sampleService;
	
	@GetMapping("list.do") //http://localhost:8092/myapp/sample/list.do 호출방법
	public String sampleList(Model model) throws Exception{
		List<SampleDTO> sampleList = sampleService.sampleList();
		model.addAttribute("sampleList", sampleList);
		return "sample/sampleList";
	}

}
