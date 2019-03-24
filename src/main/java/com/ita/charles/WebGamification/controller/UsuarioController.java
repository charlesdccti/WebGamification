package com.ita.charles.WebGamification.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController 
{

	@RequestMapping("/")
	public String home() 
	{
		return "Olá mundo!";
	}
	
	

}
