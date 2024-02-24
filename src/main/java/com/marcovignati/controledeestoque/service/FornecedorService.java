package com.marcovignati.controledeestoque.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcovignati.controledeestoque.repository.FornecedorRepository;

@Service
public class FornecedorService {

  @Autowired
  private FornecedorRepository fornecedorRepository;

}
