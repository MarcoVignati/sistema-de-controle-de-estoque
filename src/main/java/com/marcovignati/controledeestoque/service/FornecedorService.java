package com.marcovignati.controledeestoque.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcovignati.controledeestoque.model.Fornecedor;
import com.marcovignati.controledeestoque.repository.FornecedorRepository;

@Service
public class FornecedorService {

  @Autowired
  private FornecedorRepository fornecedorRepository;

  public Fornecedor salvarFornecedor(Fornecedor fornecedor) {
    return fornecedorRepository.save(fornecedor);
  }

  public List<Fornecedor> listarFornecedores() {
    return fornecedorRepository.findAll();
  }

  public Fornecedor buscarFornecedorPorId(UUID id) {
    return fornecedorRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Fornecedor não encontrado"));
  }

  public Fornecedor atualizarFornecedor(UUID id, Fornecedor fornecedor) {
    Fornecedor fornecedorExistente = buscarFornecedorPorId(id);
    fornecedorExistente.setNome(fornecedor.getNome());
    fornecedorExistente.setEndereco(fornecedor.getEndereco());
    fornecedorExistente.setTelefone(fornecedor.getTelefone());
    fornecedorExistente.setEmail(fornecedor.getEmail());
    return fornecedorRepository.save(fornecedorExistente);
  }

  public void excluirFornecedor(UUID id) {
    Fornecedor fornecedorExistente = buscarFornecedorPorId(id);
    fornecedorRepository.delete(fornecedorExistente);
  }
}
