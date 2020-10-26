package com.project.clientresource.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.clientresource.entities.Client;
import com.project.clientresource.services.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClienteResource {

	@Autowired
	private ClientService service;

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = service.fundAll();
		return ResponseEntity.ok().body(list);

	}

}