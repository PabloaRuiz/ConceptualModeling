package com.raiden;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.raiden.domain.Categorias;
import com.raiden.domain.Produtos;
import com.raiden.repositories.CategoriaRepository;
import com.raiden.repositories.ProdutosRepository;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class McApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository cateoriaRepository;
	@Autowired
	private ProdutosRepository produtosRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(McApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		 Categorias cat1 = new Categorias(null, "Informatica");
		 Categorias cat2 = new Categorias(null, "Escritorio");
		 
		 Produtos p1 = new Produtos(null, "Computador", 2000.00);
		 Produtos p2 = new Produtos(null, "Impressora", 800.00);
		 Produtos p3 = new Produtos(null, "Mouse", 80.00);
		 Produtos p4 = new Produtos(null, "Teclado", 180.00);
		 
		 cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3,p4));
		 cat2.getProdutos().addAll(Arrays.asList(p2));
		 
		 p1.getCategorias().addAll(Arrays.asList(cat1));
		 p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		 p3.getCategorias().addAll(Arrays.asList(cat1));
		 p4.getCategorias().addAll(Arrays.asList(cat1));
		 
		 cateoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		 produtosRepository.saveAll(Arrays.asList(p1, p2, p3, p4));
		 
	}
}
