package br.com.agenda.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.agenda.entities.People;
import br.com.agenda.entities.Phone;
import br.com.agenda.entities.TypePhone;
import br.com.agenda.repositories.RepositoryPeople;
import br.com.agenda.repositories.RepositoryPhone;

@Service
public class ServicePeople {
	
	@Autowired
	RepositoryPeople repositoryPeople;

	@Autowired
	RepositoryPhone repositoryPhone;
	
	public List<People> readPeople(){
		return (List<People>)repositoryPeople.findAll();
	}
	
	public List<People> readPeopleByName(String firstName){
		return repositoryPeople.findPeopleByFirstName(firstName);
	}

	public void insertPeople(People people ) {
		People newPeople = new People();
		
	
		newPeople.setFirstName(people.getFirstName());
		newPeople.setLastName(people.getLastName());
		newPeople.setCompany(people.getCompany());
		
		newPeople = repositoryPeople.saveAndFlush(newPeople);
		for (Phone phone : people.getListPhones()) {
			TypePhone type = new TypePhone();
			type.setId(1);
			phone.setTypePhone(type);
			phone.setPeople(newPeople);
		}
		repositoryPhone.saveAll(people.getListPhones());
		
	}
	
	public void deletePeople (People people ) {
			repositoryPeople.delete( people);
	}
	
	
	
	public void deletePeopleById (Long id ) {
		repositoryPeople.deleteById(id);
}
	
	
	
	public void updatePeople (People people) {
		repositoryPeople.save(people);
	}
	
}
