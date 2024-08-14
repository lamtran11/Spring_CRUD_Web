package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.controller.form.LoginForm;

@Controller
@RequestMapping("/login")
public class LoginController {
	//改行:かいぎょう「CẢI HÀNH: Dấu xuống dòng Line Break

	@GetMapping
	public String view(Model model, LoginForm form) {
		// TODO

		return "login";
	}
}
