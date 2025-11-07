package com.example.Taller_2025.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Taller_2025.Models.PersonaModel;
import com.example.Taller_2025.Service.PersonaService;

@RestController
@RequestMapping("/persona")
public class Persona {

    @Autowired
    PersonaService personaService;

    @GetMapping("/listar")
    public List<PersonaModel> listar() {
        return personaService.listar();
    }

    @PostMapping("/guardar")
    public PersonaModel guardar(@RequestBody PersonaModel persona) {
        return personaService.guardar(persona);
    }

    @PutMapping("/editar")
    public PersonaModel editar(@RequestBody PersonaModel persona) {
        return personaService.editar(persona);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable("id") int id) {
        personaService.eliminar(id);
    }

    @GetMapping("/buscar/{id}")
    public PersonaModel buscarPorId(@PathVariable("id") int id) {
        return personaService.buscarPorId(id);
    }
}
