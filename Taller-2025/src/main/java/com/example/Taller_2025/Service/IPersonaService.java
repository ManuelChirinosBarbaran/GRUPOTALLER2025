package com.example.Taller_2025.Service;

import java.util.List;
import com.example.Taller_2025.Models.PersonaModel;

public interface IPersonaService {

    public List<PersonaModel> listar();

    public PersonaModel guardar(PersonaModel persona);

    public PersonaModel editar(PersonaModel persona);

    public void eliminar(int id);
    public PersonaModel buscarPorId(int id);
}
