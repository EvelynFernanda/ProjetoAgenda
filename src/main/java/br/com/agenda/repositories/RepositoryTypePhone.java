package br.com.agenda.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.agenda.entities.TypePhone;

@Repository
public interface RepositoryTypePhone extends CrudRepository<TypePhone, Long>{
	
	

}






