package com.raiden.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.raiden.domain.Categorias;
import com.raiden.services.CategoriasService;


@RestController
@RequestMapping(value="/Categorias")
public class CategoriaResource {

	@Autowired
	private CategoriasService service;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categorias obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
		
	}

}
