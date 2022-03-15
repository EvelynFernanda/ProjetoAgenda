package br.com.agenda.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "tipo_telefone")
public class TypePhone {
	
	@Id
	@Column(name = "id_tipo_telefone")
	private int id;
	
	@Column(name = "desc_tipo_telefone")
	private String descPhone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescPhone() {
		return descPhone;
	}

	public void setDescPhone(String descPhone) {
		this.descPhone = descPhone;
	}
	
	

}
