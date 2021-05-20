package com.maurelllopes.sitema_de_pedidos.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.maurelllopes.sitema_de_pedidos.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}

