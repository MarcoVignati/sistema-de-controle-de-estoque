package com.marcovignati.controledeestoque.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcovignati.controledeestoque.model.Fornecedor;
import com.marcovignati.controledeestoque.service.FornecedorService;

@RestController
@RequestMapping("api/fornecedores")
public class FornecedorController {
  
  @Autowired
  private FornecedorService fornecedorService;

  @PostMapping
  public ResponseEntity<Fornecedor> criarFornecedor(@RequestBody Fornecedor fornecedor) {
    Fornecedor novoFornecedor = fornecedorService.salvarFornecedor(fornecedor);
    return new ResponseEntity<>(novoFornecedor, HttpStatus.CREATED);
  }

  @GetMapping
  public ResponseEntity<List<Fornecedor>> listarFornecedores() {
    List<Fornecedor> fornecedores = fornecedorService.listarFornecedores();
    return new ResponseEntity<>(fornecedores, HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Fornecedor> obterFornecedorPorId(@PathVariable UUID id) {
    Fornecedor fornecedor = fornecedorService.buscarFornecedorPorId(id);
    return new ResponseEntity<>(fornecedor, HttpStatus.OK);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Fornecedor> atualizarFornecedor(@PathVariable UUID id, @RequestBody Fornecedor fornecedor) {
    Fornecedor fornecedorAtualizado = fornecedorService.atualizarFornecedor(id, fornecedor);
    return new ResponseEntity<>(fornecedorAtualizado, HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> excluirFornecedor(@PathVariable UUID id) {
    fornecedorService.excluirFornecedor(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }

}
