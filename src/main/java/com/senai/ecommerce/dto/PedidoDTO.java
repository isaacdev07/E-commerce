package com.senai.ecommerce.dto;

import java.time.Instant;

import com.senai.ecommerce.entities.StatusDoPedido;

public record PedidoDTO(Instant momento, StatusDoPedido status) {

}
