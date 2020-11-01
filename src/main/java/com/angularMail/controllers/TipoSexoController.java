package com.angularMail.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angularMail.model.entities.TipoSexo;
import com.angularMail.model.repositories.TipoSexoRepository;

@CrossOrigin
@RestController
public class TipoSexoController { // La clase que pide el ejercicio (TipoSexoController) ya está creada.

	@Autowired
	TipoSexoRepository tipoSexoRep;
	
	@GetMapping("tiposexo/all")
	public Iterable<TipoSexo> getAllTiposSexo () {
		return this.tipoSexoRep.findAll();
	}
}
