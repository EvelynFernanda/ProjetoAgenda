package br.com.agenda.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import br.com.agenda.entities.People;

@Repository
public interface RepositoryPeople extends CrudRepository<People, Long>{
	void deleteById(int id);
	List<People> findPeopleByFirstName(String firstName);
	People saveAndFlush(People people); 
	

}
