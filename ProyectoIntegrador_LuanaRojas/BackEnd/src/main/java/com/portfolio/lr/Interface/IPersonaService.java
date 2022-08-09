
package com.portfolio.lr.Interface;

import com.portfolio.lr.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //para traer una lista de personas
    public List<Persona> getPersona();
    //para guardar un objeto de tipo Persona
    public void savePersona (Persona persona);
    //eliminar un objeto buscado por ID
    public void deletePersona(Long id);
    //buscar persona por ID
    public Persona findPersona(Long id);
    
}
