package org.bedu.java.backend.Sesion6Postwork.service;

import org.bedu.java.backend.Sesion6Postwork.model.Persona;
import org.bedu.java.backend.Sesion6Postwork.persistence.AgendaMemoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AgendaService {
    private final ValidadorTelefono validadorTelefono;
    private final AgendaMemoryDao agendaMemoryDao;

    @Autowired
    public AgendaService(ValidadorTelefono validadorTelefono, AgendaMemoryDao agendaMemoryDao) {
        this.validadorTelefono = validadorTelefono;
        this.agendaMemoryDao = agendaMemoryDao;
    }

    public Persona guardaPersona(Persona persona) {
        if (!validadorTelefono.isValido(persona.getTelefono())) {
            return null;
        }
        String telefono = validadorTelefono.limpiaNumero(persona.getTelefono());
        persona.setTelefono(telefono);

        return agendaMemoryDao.guardaPersona(persona);
    }

    public Set<Persona> getPersonas() {
        return agendaMemoryDao.getPersonas();
    }
}
