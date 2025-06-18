package com.pedido.pedido.model;

import com.pedido.pedido.dto.ProductoDTO;

public record Pedido(String id, ProductoDTO producto, int cantidad) {}
