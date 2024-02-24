package com.marcovignati.controledeestoque.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcovignati.controledeestoque.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, UUID> {
  
}
