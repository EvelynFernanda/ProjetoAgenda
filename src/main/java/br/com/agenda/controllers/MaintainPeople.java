package br.com.agenda.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/people")
public class MaintainPeople {
	
	int id;
    String nome;
    String sobrenome;
    
    @GetMapping
    @ResponseBody
    public String searchPeople(){
        this.nome = "Yan";
        this.sobrenome = "Santana";
        return this.nome+" "+this.sobrenome;
    
}}