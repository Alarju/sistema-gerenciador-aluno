package net.personalprojects.sga.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("estudantes/editar/{id}")
	public String editarFormEstudante(@PathVariable Long id, Model model) {
		model.addAttribute("estudante", estudanteService.getEstudanteById(id));
		return "editar_estudante";
	}
	
	@PostMapping("estudantes/{id}")
	public String atualizaEstudante(@PathVariable Long id, @ModelAttribute("estudante") Estudante estudante, Model model) {
		//buscar o estudante do banco de dados pelo id
		Estudante existente = estudanteService.getEstudanteById(id);
		existente.setId(id);
		existente.setNome(estudante.getNome());
		existente.setSobrenome(estudante.getSobrenome());
		existente.setEmail(estudante.getEmail());
		
		//salvar as alterações do objeto estudante
		estudanteService.atualizarEstudante(existente);
		return "redirect:/estudantes";
	}
	
	@GetMapping("/estudantes/{id}")
	public String deletarEstudante(@PathVariable Long id) {
		estudanteService.deleteEstudanteById(id);
		return "redirect:/estudantes";
	}
	
	

}
