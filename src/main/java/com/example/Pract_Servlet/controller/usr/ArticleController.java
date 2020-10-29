package com.example.Pract_Servlet.controller.usr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ArticleController {
	@RequestMapping("/usr/article/list")
	@ResponseBody
	public String showList() {
		return "/usr/article/list";
	}

}
