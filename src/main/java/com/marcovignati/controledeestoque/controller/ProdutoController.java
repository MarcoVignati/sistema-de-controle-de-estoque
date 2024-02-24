package com.marcovignati.controledeestoque.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcovignati.controledeestoque.service.ProdutoService;

@RestController
@RequestMapping("api/produtos")
public class ProdutoController {

  @Autowired
  private ProdutoService produtoService;
}
