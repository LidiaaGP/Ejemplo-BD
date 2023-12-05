package com.ipartek.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuControlador {
	
	@RequestMapping("/")
	public String cargarInicio() {
		return "index";
	}
	
	@RequestMapping("/infantil")
	public String cargarInfantil() {
		return "index";
	}
	
	@RequestMapping("/educativo")
	public String cargarEducativo() {
		return "educativo";
	}
	
	@RequestMapping("/deportivo")
	public String cargarDeportivo() {
		return "deportivo";
	}
	
}
