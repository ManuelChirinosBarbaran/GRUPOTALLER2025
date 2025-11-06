package com.example.Taller_2025.Controllers;

import com.example.Taller_2025.Models.PersonaModel;
import com.example.Taller_2025.Service.PersonaService;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")

public class Persona {
    @Autowired
    PersonaService personaService;

    @GetMapping("/listar")
    public List<PersonaModel> listar() {
        return personaService.listar();
    }

    @PutMapping("/editar")
    public PersonaModel editar(@RequestBody PersonaModel persona) {
        return personaService.editar(persona);
    }

    @DeleteMapping("/eliminar")
    public void eliminar(@RequestAttribute("id") int id) {
        personaService.eliminar(id);
    }

    @PostMapping("/guardar")
    public PersonaModel guardar(@RequestBody PersonaModel persona) {
        return personaService.guardar(persona);
    }

}
