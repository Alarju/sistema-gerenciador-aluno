package net.personalprojects.sga.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import net.personalprojects.sga.entity.Estudante;
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
	
	@GetMapping("/estudantes/new")
	public String CriarFormEstudante(Model model) {
		Estudante estudante = new Estudante();
		model.addAttribute("estudante", estudante);
		return "criar_estudante";
	}
	
	@PostMapping("/estudantes")
	public String salvarEstudante(@ModelAttribute("estudante") Estudante estudante) {
		estudanteService.salvarEstudante(estudante);
		return "redirect:/estudantes";
	}
	
	

}
