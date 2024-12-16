package com.generation.projeto_final_bloco_02.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo nome não deve ser nulo")
	@Size(min = 5, max = 50, message = "O atributo nome precisa ter no mínimo 5 e máximo 50 caractéres")
	private String nomeProduto;
	
	@NotNull(message = "O preço do produto não deve ser nulo.")
	@DecimalMin(value = "0.01", inclusive = true, message = "O preço deve ser maior que zero.")
	private Double preco;

	@NotNull(message = "A quantidade do produto não deve ser nulo.")
    @Positive(message = "A quantidade deve ser um número positivo.")
	private Integer quantidade; 
	
	@NotNull(message = "O número de vendas não pode ser nulo.")
	@Positive(message = "O número de vendas deve ser positivo.")
	private int vendas;
	
	@ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public int getVendas() {
		return vendas;
	}

	public void setVendas(int vendas) {
		this.vendas = vendas;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	

}
