package com.raiden.services;

import com.raiden.domain.Categorias;
import com.raiden.repositories.CategoriaRepository;


public class CategoriasService {
	
	private CategoriaRepository repo;
	
	public Categorias buscar(Integer id) {
		Categorias obj = repo.findOne(id);
		return obj;
	}
}
