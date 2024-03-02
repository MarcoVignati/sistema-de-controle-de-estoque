package com.marcovignati.controledeestoque.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcovignati.controledeestoque.model.Produto;
import com.marcovignati.controledeestoque.service.ProdutoService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/produtos")
public class ProdutoController {

  @Autowired
  private ProdutoService produtoService;

  @PostMapping
  public ResponseEntity<Produto> criarProduto(@RequestBody Produto produto) {
    Produto novoProduto = produtoService.salvarProduto(produto);
    return new ResponseEntity<>(novoProduto, HttpStatus.CREATED);
  }

  @GetMapping
  public ResponseEntity<List<Produto>> listarProdutos() {
    List<Produto> produtos = produtoService.listarProdutos();
    return new ResponseEntity<>(produtos, HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Produto> obterProdutoPorId(@PathVariable UUID id) {
    Produto produto = produtoService.buscarProdutoPorId(id);
    return new ResponseEntity<>(produto, HttpStatus.OK);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Produto> atualizarProduto(@PathVariable UUID id, @RequestBody Produto produto) {
    Produto produtoAtualizado = produtoService.atualizarProduto(id, produto);
    return new ResponseEntity<>(produtoAtualizado, HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> excluirProduto(@PathVariable UUID id) {
    produtoService.excluirProduto(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }

}
