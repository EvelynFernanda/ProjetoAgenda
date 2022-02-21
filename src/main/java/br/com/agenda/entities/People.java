package br.com.agenda.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Pessoa")
public class People {

	@Id
	@Column(name = "idPessoa")
	private int id;
	
	@Column(name = "nomePessoa")
	private String firstName;
	
	@Column(name = "sobrenomePessoa")
	private String lastName;
	
	@Column(name = "empresaPessoa")
	private String company;
   

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
	
	
}
