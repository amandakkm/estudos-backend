package com.br.aulamanytomany.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.aulamanytomany.dto.ContatoDto;
import com.br.aulamanytomany.entities.Contato;
import com.br.aulamanytomany.services.ContatoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/contato")
public class ContatoController {

    @Autowired
    ContatoService service;

    @GetMapping("/lista")
    public ResponseEntity<List<ContatoDto>> listar() {
        return new ResponseEntity<>(service.lista(), HttpStatus.OK);
    }

    @PostMapping("/novo")
    public ResponseEntity<String> cadastrar(Contato contato) {
        return new ResponseEntity<>(service.cadastro(contato), HttpStatus.OK);
    }

}
