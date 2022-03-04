package br.com.agenda.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "telefone")
public class Phone {
	
	@Id
	@Column(name = "idTelefone")
	private int id;
	
	@Column(name = "codPaisTelefone")
	private String codCountry;
	
	@Column(name = "codAreaTelefone")
	private String codArea;
	
	@Column(name = "numTelefone")
	private String numPhone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodCountry() {
		return codCountry;
	}

	public void setCodCountry(String codCountry) {
		this.codCountry = codCountry;
	}

	public String getCodArea() {
		return codArea;
	}

	public void setCodArea(String codArea) {
		this.codArea = codArea;
	}

	public String getNumPhone() {
		return numPhone;
	}

	public void setNumPhone(String numPhone) {
		this.numPhone = numPhone;
	}
	
	

}
