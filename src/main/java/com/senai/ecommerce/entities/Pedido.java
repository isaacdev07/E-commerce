package com.senai.ecommerce.entities;

import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedido")
public class Pedido {

	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Usuario cliente;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private Instant momento;
	private StatusDoPedido status;
	
	@OneToOne(mappedBy = "pedido", cascade = CascadeType.ALL)
	private Pagamento pagamento;
	
	@OneToMany(mappedBy = "id.pedido")
	private Set<ItemDoPedido> items = new HashSet<>();
	
	
	public Pedido() {
		
	}
	
	public Pedido(Usuario cliente, long id, Instant momento, StatusDoPedido status) {
		this.cliente = cliente;
		this.id = id;
		this.momento = momento;
		this.status = status;
	}



	public Usuario getCliente() {
		return cliente;
	}



	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public Instant getMomento() {
		return momento;
	}



	public void setMomento(Instant momento) {
		this.momento = momento;
	}



	public StatusDoPedido getStatus() {
		return status;
	}



	public void setStatus(StatusDoPedido status) {
		this.status = status;
	}
	
	public Set<ItemDoPedido> getItems(){
		return items;
	}
	
	public List<Produto> getProduto(){
		
		return items.stream().map(x -> x.getProduto()).toList();
	}
	
}
