/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.service;

import com.mycompany.finalproyect.models.Profesor;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author reyg6
 */
@Stateless
public class ProfesorServicio {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    public void insertarProfesor(Profesor profesor){
        
        this.entityManager.persist(profesor);
    }
    
    public Profesor encontrarProfesor(int dpi){
        
        Profesor profesorE = new Profesor();
        
        profesorE = this.entityManager.find(Profesor.class, dpi);
        
        return profesorE;
    }
    
    
     public void borrarProfesor(Profesor profe){
        
        this.entityManager.remove(profe);
        
    }
     
     public void updateProfesor(Profesor profesor){
        
        this.entityManager.merge(profesor);
    }
     
    
    
}
