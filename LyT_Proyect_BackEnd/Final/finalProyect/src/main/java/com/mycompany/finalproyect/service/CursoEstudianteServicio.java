/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.service;

import com.mycompany.finalproyect.models.CursoEstudiante;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author reyg6
 */
@Stateless
public class CursoEstudianteServicio {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    public void ingresarDatos(CursoEstudiante cursoEstudiante){
        
        this.entityManager.persist(cursoEstudiante);
    }
    
}
