package com.pedido.pedido.feignclients;

import com.pedido.pedido.dto.ProductoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "producto-service")
public interface ProductoClient {
    @GetMapping("/productos")
    List<ProductoDTO> obtenerProductos();
}

