package com.marcovignati.controledeestoque.service;

import java.util.UUID;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcovignati.controledeestoque.model.Produto;
import com.marcovignati.controledeestoque.repository.ProdutoRepository;

@Service
public class ProdutoService {

  @Autowired
  private ProdutoRepository produtoRepository;

  public Produto salvarProduto(Produto produto) {
    return produtoRepository.save(produto);
  }

  public List<Produto> listarProdutos() {
    return produtoRepository.findAll();
  }

  public Produto buscarProdutoPorId(UUID id) {
    return produtoRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
  }

  public Produto atualizarProduto(UUID id, Produto produto) {
    Produto produtoExistente = buscarProdutoPorId(id);
    produtoExistente.setNome(produto.getNome());
    produtoExistente.setDescricao(produto.getDescricao());
    produtoExistente.setPreco(produto.getPreco());
    produtoExistente.setQuantidadeEstoque(produto.getQuantidadeEstoque());
    return produtoRepository.save(produtoExistente);
  }

  public void excluirProduto(UUID id) {
    Produto produtoExistente = buscarProdutoPorId(id);
    produtoRepository.delete(produtoExistente);
  }

}
