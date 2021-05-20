package com.maurelllopes.sitema_de_pedidos.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maurelllopes.sitema_de_pedidos.domain.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}

