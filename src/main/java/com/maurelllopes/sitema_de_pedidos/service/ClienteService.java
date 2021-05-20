package com.maurelllopes.sitema_de_pedidos.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maurelllopes.sitema_de_pedidos.domain.Cliente;
import com.maurelllopes.sitema_de_pedidos.repositories.ClienteRepository;
import com.maurelllopes.sitema_de_pedidos.service.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;

	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}

}

