package net.personalprojects.sga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.personalprojects.sga.entity.Estudante;
import net.personalprojects.sga.repository.EstudanteRepository;

@SpringBootApplication
public class SistemaGerenciadorAlunosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SistemaGerenciadorAlunosApplication.class, args);
	}

	@Autowired
	private EstudanteRepository estudanteRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		Estudante estudante1 = new Estudante("Alexander", "Juyumaya", "alex.geass@gmail.com");
		estudanteRepository.save(estudante1);
		
		Estudante estudante2 = new Estudante("Thalia", "Kelsyn", "tkelsyn@gmail.com");
		estudanteRepository.save(estudante2);
		
		Estudante estudante3 = new Estudante("Alicia", "Juyumaya", "kelsyn.juyumaya@gmail.com");
		estudanteRepository.save(estudante3);
		*/
		
	}

}
