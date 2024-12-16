package com.generation.projeto_final_bloco_02.repository;

import com.generation.projeto_final_bloco_02.model.Produto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	List<Produto> findByNomeProdutoContainingIgnoreCase(String nomeProduto);
}