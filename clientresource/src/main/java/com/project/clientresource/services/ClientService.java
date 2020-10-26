package com.project.clientresource.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.clientresource.entities.Client;
import com.project.clientresource.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	public List<Client> fundAll(){
		return repository.findAll();
	}

}
