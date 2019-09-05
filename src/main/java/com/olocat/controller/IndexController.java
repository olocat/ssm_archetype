package com.olocat.controller;

import com.olocat.pojo.User;
import com.olocat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {
	@Autowired(required = false)
	private UserService userService;

	@RequestMapping("/index")
	public String  index(Model model){
		model.addAttribute("msg","hi SpringMvc");
		return "index";
	}
	@RequestMapping("/show")
	public String show(Model model){
		List<User> userList = userService.getUserList();
		if(userService != null) {
			model.addAttribute("list", userList);
		}else {
			System.out.println("userService is null");
		}
		model.addAttribute("msg","hi SpringMvc");
		return "index";
	}
}
