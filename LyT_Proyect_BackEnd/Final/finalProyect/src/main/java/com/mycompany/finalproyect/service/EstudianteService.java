/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.service;


import com.mycompany.finalproyect.models.Estudiante;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author reyg6
 */
@Stateless
public class EstudianteService {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    
    /**
     * Insert Estudiante en la tabla estudiante.
     */
    
    public void insertarEstudiante(Estudiante estudiante){
        
        this.entityManager.persist(estudiante);
    }
    
    public Estudiante encontrarEstudiante(int idEstudiante){
        
        Estudiante encontradoE = new Estudiante();
        
        encontradoE = this.entityManager.find(Estudiante.class, idEstudiante);
        
        return encontradoE;
    }
    
    public void borrarEstudiante(Estudiante student){
        
        
        
        
        this.entityManager.merge(student);
        
    }
    
    public void updateStudent(Estudiante student){
        
        this.entityManager.merge(student);
    }
    
}
