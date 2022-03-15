package br.com.agenda.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.agenda.entities.TypePhone;
import br.com.agenda.services.ServiceTypePhone;


@RestController
@RequestMapping("/typePhone")
public class MaintainTypePhone {
	
	@Autowired
	ServiceTypePhone serviceTypePhone;
	
	 @GetMapping
	 @ResponseBody
	 public List<TypePhone> readTypePhone(){
	    return serviceTypePhone.readTypePhone();
	 }

}
