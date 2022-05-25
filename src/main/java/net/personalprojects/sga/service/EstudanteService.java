package net.personalprojects.sga.service;

import java.util.List;

import net.personalprojects.sga.entity.Estudante;

public interface EstudanteService {
	
	List<Estudante> getAllEstudantes();
	
	Estudante salvarEstudante(Estudante estudante);
	
	Estudante getEstudanteById(Long id);
	
	Estudante atualizarEstudante(Estudante estudante);

}
