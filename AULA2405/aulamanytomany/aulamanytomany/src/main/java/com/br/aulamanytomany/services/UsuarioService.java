package com.br.aulamanytomany.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.aulamanytomany.dto.UsuarioDto;
import com.br.aulamanytomany.entities.Usuario;
import com.br.aulamanytomany.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository repository;

    public List<UsuarioDto> lista(){
        List<Usuario> usuarios = repository.findAll();

        return usuarios.stream().map(x -> new UsuarioDto(x)).collect(Collectors.toList());
    }

    public String cadastro(Usuario usuario){
        repository.save(usuario);
        return "Cadastrado com suceso!";
    }
    
}
