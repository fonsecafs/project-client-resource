package com.project.clientresource.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.clientresource.dto.ClientDTO;
import com.project.clientresource.services.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClienteResource {

	@Autowired
	private ClientService service;

	@GetMapping
	public ResponseEntity<List<ClientDTO>> findAll() {
		List<ClientDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);

	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ClientDTO> finById(@PathVariable Long id) {
		ClientDTO dto = service.finById(id);
		return ResponseEntity.ok().body(dto);

	}

}
