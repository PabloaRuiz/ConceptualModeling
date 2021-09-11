package com.raiden;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.raiden.domain.Categorias;
import com.raiden.repositories.CategoriaRepository;
import java.util.Arrays;

@SpringBootApplication
public class McApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository cateoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(McApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		 Categorias cat1 = new Categorias(null, "Informatica");
		 Categorias cat2 = new Categorias(null, "Escritorio");
		 
		 cateoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		 
	}
}
