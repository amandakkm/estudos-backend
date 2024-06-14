package com.br.aulamanytomany.dto;

import com.br.aulamanytomany.entities.Contato;

public class ContatoDto {

    private int id;
    private String nome;
    private String telefone;

    public ContatoDto(Contato contato) {
        this.id = contato.getId();
        this.nome = contato.getNome();
        this.telefone = contato.getTelefone();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
