package br.com.agenda.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.agenda.entities.Phone;

@Repository
public interface RepositoryPhone  extends CrudRepository<Phone, Long> {


}