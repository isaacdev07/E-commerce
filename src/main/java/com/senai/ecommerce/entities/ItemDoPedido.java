package com.senai.ecommerce.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_item_do_pedido")
public class ItemDoPedido {
	
	private int quantidade;
	private Double preco;
	
	
	public ItemDoPedido(int quantidade, Double preco) {
		this.quantidade = quantidade;
		this.preco = preco;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	

}
