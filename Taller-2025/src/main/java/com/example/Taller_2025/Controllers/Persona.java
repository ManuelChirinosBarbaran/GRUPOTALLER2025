package com.example.Taller_2025.Controllers;

import com.example.Taller_2025.Models.PersonaModel;
import com.example.Taller_2025.Service.PersonaService;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")

public class Persona {
    @Autowired
    PersonaService personaService;


    @PostMapping("/guardar")
    public PersonaModel add(@RequestBody PersonaModel persona) {
        return personaService.add(persona);
    }

}
