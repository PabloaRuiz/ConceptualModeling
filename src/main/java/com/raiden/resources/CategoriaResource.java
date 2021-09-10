package com.raiden.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.raiden.domain.Categorias;


@RestController
@RequestMapping(value="/Categorias")
public class CategoriaResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Categorias> listar() {
		
		Categorias cat1 = new Categorias(1, "Informatica");
		Categorias cat2 = new Categorias(2, "Escritorio");
		
		List<Categorias> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		
		return lista;
	}

}
