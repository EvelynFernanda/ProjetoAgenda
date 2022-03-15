package br.com.agenda.entities;
import java.util.List;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name = "pessoa")
public class People {

	@Id
	@Column(name = "idPessoa")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nomePessoa")
	private String firstName;
	
	@Column(name = "sobrenomePessoa")
	private String lastName;
	
	@Column(name = "empresaPessoa")
	private String company;
	
   @OneToMany(mappedBy = "people", cascade = CascadeType.ALL,  fetch = FetchType.LAZY )
   @JsonManagedReference
	private List<Phone> listPhones;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public List<Phone> getListPhones() {
		return listPhones==null?new ArrayList<Phone>():listPhones;
	}

	public void setListPhones(List<Phone> listPhones) {
		this.listPhones = listPhones;
	}
	
	
	
}
