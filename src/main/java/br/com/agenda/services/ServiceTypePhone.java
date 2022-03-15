package br.com.agenda.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.agenda.entities.TypePhone;
import br.com.agenda.repositories.RepositoryTypePhone;

@Service
public class ServiceTypePhone {

	@Autowired
	RepositoryTypePhone repositoryTypePhone;
	
	
	public List<TypePhone> readTypePhone(){
		return (List<TypePhone>)repositoryTypePhone.findAll();
	}


}
