package com.example.Taller_2025.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Taller_2025.Models.PersonaModel;
import com.example.Taller_2025.Repository.IPersonaRepository;
import jakarta.transaction.Transactional;

@Service
public class PersonaService implement IPersonaService {

    @Autowired
    IPersonaRepository IpersonaRepository;

    @Override
    @Transactional
    public PersonaModel guardar(PersonaModel persona) {
        return IpersonaRepository.save(persona);
    }

}
