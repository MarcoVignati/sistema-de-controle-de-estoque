package com.marcovignati.controledeestoque.model;

import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  private String nome;
  private String descricao;
  private double preco;
  private int quantidadeEstoque;

  public Produto() {

  }

  public Produto(String nome, String descricao, double preco, int quantidadeEmEstoque) {
    this.nome = nome;
    this.descricao = descricao;
    this.preco = preco;
    this.quantidadeEstoque = quantidadeEmEstoque;
}

  public UUID getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public double getPreco() {
    return preco;
  }

  public int getQuantidadeEstoque() {
    return quantidadeEstoque;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public void setQuantidadeEstoque(int quantidadeEstoque) {
    this.quantidadeEstoque = quantidadeEstoque;
  }
  
}
