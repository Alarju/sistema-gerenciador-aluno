package net.personalprojects.sga.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.personalprojects.sga.entity.Estudante;
import net.personalprojects.sga.repository.EstudanteRepository;
import net.personalprojects.sga.service.EstudanteService;

@Service
public class EstudanteServiceImpl implements EstudanteService{
	
	private EstudanteRepository estudanteRepository;

	public EstudanteServiceImpl(EstudanteRepository estudanteRepository) {
		super();
		this.estudanteRepository = estudanteRepository;
	}



	@Override
	public List<Estudante> getAllEstudantes() {
		return estudanteRepository.findAll();
	}



	@Override
	public Estudante salvarEstudante(Estudante estudante) {
		return estudanteRepository.save(estudante);
	}



	@Override
	public Estudante getEstudanteById(Long id) {
		return estudanteRepository.findById(id).get();
	}



	@Override
	public Estudante atualizarEstudante(Estudante estudante) {
		return estudanteRepository.save(estudante);
	}



	@Override
	public void deleteEstudanteById(Long id) {
		estudanteRepository.deleteById(id);
		
	}



}
