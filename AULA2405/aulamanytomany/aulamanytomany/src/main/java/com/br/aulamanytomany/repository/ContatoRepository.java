package com.br.aulamanytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.aulamanytomany.entities.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer> {

}
