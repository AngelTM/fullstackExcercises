package mx.com.angeltm.config;

import java.util.List;

import org.springframework.boot.CommandLineRunner;

import mx.com.angeltm.dao.PersonaDao;
import mx.com.angeltm.domain.Persona;

public class PersonaConfig {
    CommandLineRunner commandLineRunner(PersonaDao repository){
        return args ->{
                    Persona angel = new Persona("Angel","Garate","angel@gmail.com","669254687");
                    repository.saveAll(
                        List.of(angel)
                    );
                };
            } 
}
