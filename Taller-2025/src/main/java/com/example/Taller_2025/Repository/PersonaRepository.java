package com.example.Taller_2025.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.Taller_2025.Models.PersonaModel;

@Repository
public interface PersonaRepository extends CrudRepository<PersonaModel, Integer> {

}
