package com.example.Taller_2025.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Taller_2025.Models.PersonaModel;
import com.example.Taller_2025.Repository.PersonaRepository;

@Service
public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    public List<PersonaModel> listar() {
        return (List<PersonaModel>) personaRepository.findAll();
    }

    public PersonaModel guardar(PersonaModel persona) {
        return personaRepository.save(persona);
    }

    public PersonaModel editar(PersonaModel persona) {
        return personaRepository.save(persona);
    }

    public void eliminar(int id) {
        personaRepository.deleteById(id);
    }

    public PersonaModel buscarPorId(int id) {
        Optional<PersonaModel> persona = personaRepository.findById(id);
        return persona.orElse(null);
}
}