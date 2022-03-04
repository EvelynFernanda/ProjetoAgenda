package br.com.agenda.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.agenda.entities.People;

@Repository
public interface RepositoryPeople extends JpaRepository<People, Long>{
	List<People> findPeopleByFirstName(String firstName);
	

}
