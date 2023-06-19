package mx.com.angeltm.dao;

import org.springframework.data.repository.CrudRepository;

import mx.com.angeltm.domain.Persona;

public interface PersonaDao extends CrudRepository<Persona, Long>{
    
}
