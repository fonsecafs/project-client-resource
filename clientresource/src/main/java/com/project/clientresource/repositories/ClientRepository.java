package com.project.clientresource.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.clientresource.entities.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

	
}
