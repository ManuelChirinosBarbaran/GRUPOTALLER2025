package com.example.Taller_2025.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Taller_2025.Models.PersonaModel;
import com.example.Taller_2025.Repository.PersonaRepository;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    PersonaRepository personaRepository;

    @Override
    public PersonaModel add(PersonaModel personaModel) {
        return personaRepository.save(per);
    }

}
