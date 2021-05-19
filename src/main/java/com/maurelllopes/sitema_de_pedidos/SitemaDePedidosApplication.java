package com.maurelllopes.sitema_de_pedidos;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.maurelllopes.sitema_de_pedidos.domain.Categoria;
import com.maurelllopes.sitema_de_pedidos.repositories.CategoriaRepository;

@SpringBootApplication
public class SitemaDePedidosApplication implements CommandLineRunner  {
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(SitemaDePedidosApplication.class, args);

}
	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
	

}}
