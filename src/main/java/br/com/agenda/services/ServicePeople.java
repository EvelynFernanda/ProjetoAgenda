package br.com.agenda.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.agenda.entities.People;
import br.com.agenda.repositories.RepositoryPeople;

@Service
public class ServicePeople {
	
	@Autowired
	RepositoryPeople repositoryPeople;
	
	public List<People> readPeople(){
		return (List<People>)repositoryPeople.findAll();
	}
	
	public List<People> readPeopleByName(String firstName){
		return repositoryPeople.findPeopleByFirstName(firstName);
	}

	public void insertPeople(People people) {
		repositoryPeople.save(people);
		
	}
	
	public void deletePeople(People people) {
		repositoryPeople.delete(people);
		
	}
	public void deletePeopleById(Long id) {
		repositoryPeople.deleteById(id);
		
	}
	public void updatePeople(People people) {
		repositoryPeople.save(people);
		
	}

	
}
