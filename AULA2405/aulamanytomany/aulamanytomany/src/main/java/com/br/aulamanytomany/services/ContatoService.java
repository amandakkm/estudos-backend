package com.br.aulamanytomany.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.aulamanytomany.dto.ContatoDto;
import com.br.aulamanytomany.entities.Contato;
import com.br.aulamanytomany.repository.ContatoRepository;

@Service
public class ContatoService {

    @Autowired
    ContatoRepository repository;

    public List<ContatoDto> lista() {
        List<Contato> contatos = repository.findAll();
        return contatos.stream().map(x -> new ContatoDto(x)).collect(Collectors.toList());
    }

    public String cadastro(Contato contato) {
        repository.save(contato);
        return "Cadastrado com suceso!";
    }

}
