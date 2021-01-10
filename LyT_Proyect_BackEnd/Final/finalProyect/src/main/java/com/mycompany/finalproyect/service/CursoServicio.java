/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.service;

import com.mycompany.finalproyect.models.Curso;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author reyg6
 */
@Stateless
public class CursoServicio {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    public void newCurso(Curso curso){
        
        this.entityManager.persist(curso);
    }
    
    public void updateCurso(Curso curso){
        
        this.entityManager.merge(curso);
       
       
    }
 
    public Curso buscar(int idCurso){
        
        Curso curso = this.entityManager.find(Curso.class, idCurso);
        
        return curso;
    }
    
    
}
