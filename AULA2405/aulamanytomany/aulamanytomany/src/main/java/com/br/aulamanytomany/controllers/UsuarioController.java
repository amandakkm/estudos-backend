package com.br.aulamanytomany.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.aulamanytomany.dto.UsuarioDto;
import com.br.aulamanytomany.entities.Usuario;
import com.br.aulamanytomany.services.UsuarioService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService service;

    @GetMapping("/lista")
    public ResponseEntity<List<UsuarioDto>> listar() {
        return new ResponseEntity<>(service.lista(), HttpStatus.OK);
    }

    @PostMapping("/novo")
    public ResponseEntity<String> cadastrar(Usuario usuario) {
        return new ResponseEntity<>(service.cadastro(usuario), HttpStatus.OK);
    }
    
    

}
