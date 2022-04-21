package net.personalprojects.sga.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.personalprojects.sga.service.EstudanteService;

@Controller
public class EstudanteController {
	
	private EstudanteService estudanteService;

	public EstudanteController(EstudanteService estudanteService) {
		super();
		this.estudanteService = estudanteService;
	}
	
	//handler method to handle list students and return mode and view
	@GetMapping("/estudantes")
	public String listEstudantes (Model model) {
		model.addAttribute("estudantes", estudanteService.getAllEstudantes());
		return "estudantes";
	}
	
	

}
