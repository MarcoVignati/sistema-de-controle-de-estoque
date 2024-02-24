package com.marcovignati.controledeestoque.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcovignati.controledeestoque.service.FornecedorService;

@RestController
@RequestMapping("api/fornecedores")
public class FornecedorController {
  
  @Autowired
  private FornecedorService fornecedorService;
}
