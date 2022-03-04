package br.com.agenda.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.agenda.entities.People;
import br.com.agenda.services.ServicePeople;


@RestController
@RequestMapping("/People")
public class MaintainPeople {
	
	@Autowired
	ServicePeople servicePeople;
    
    @GetMapping
    @ResponseBody
    public List<People> readPeople(){
    	return servicePeople.readPeople();
    }
   

    @GetMapping("/{name}")
    @ResponseBody
    public List<People> readPeopleByName(@PathVariable(value="name") String firstName){
	  	return servicePeople.readPeopleByName(firstName);
    
	  	
}
    @DeleteMapping
    @ResponseBody
    public void deletePeople(@RequestBody People people){
    	servicePeople.deletePeople(people);
       
}
    @DeleteMapping("/{id}")
    @ResponseBody
    public void deletePeopleById(@PathVariable(value="id") Long id){
    	servicePeople.deletePeopleById(id);
       
    }
    
    @PutMapping
    @ResponseBody
    public void updatePeople(@RequestBody People people){
    	servicePeople.updatePeople(people);
    }
    @PostMapping
    @ResponseBody
    public void criatePeople(@RequestBody People people){
    	servicePeople.insertPeople(people);
      
    
}
    
    
}