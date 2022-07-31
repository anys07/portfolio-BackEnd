/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.anabel.Interface;

import com.portfolio.anabel.Entity.Persona;
import java.util.List;


/**
 *
 * @author grafi
 */
public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    //Guardas un objeto de tipo Persona
    public void savePersona(Persona persona);
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    //Buscar una persona por Id
    public Persona findPersona(Long id);
}
