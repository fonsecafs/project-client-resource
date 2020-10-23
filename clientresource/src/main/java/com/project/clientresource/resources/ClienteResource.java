package com.project.clientresource.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.clientresource.entities.Cliente;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {
	
	@GetMapping
	public ResponseEntity<List<Cliente>> findAll(){
		List<Cliente> list = new ArrayList<>();
		list.add(new Cliente(1L, "João","12345678912", 5500.00,Instant.now(), 2));
		list.add(new Cliente(2L, "Maria","12345678912", 5500.00, Instant.now(), 2));
		return ResponseEntity.ok().body(list);
		
	}

}
