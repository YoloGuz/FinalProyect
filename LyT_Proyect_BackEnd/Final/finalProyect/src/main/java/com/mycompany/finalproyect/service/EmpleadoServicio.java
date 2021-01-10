/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.service;

import com.mycompany.finalproyect.models.Empleado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author reyg6
 */
@Stateless
public class EmpleadoServicio {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    public void insertarEmpleado(Empleado empleado){
        
        this.entityManager.persist(empleado);
    }
    
    public Empleado encontrarEmpleado(int codigoEmpleado){
        
        Empleado empleado = new Empleado();
        
        empleado = this.entityManager.find(Empleado.class, codigoEmpleado);
        
        return empleado;
    }
    
    public void updateEmpleado(Empleado empleado){
        
        this.entityManager.merge(empleado);
    }
    
    public void borrarEmpleado(Empleado empleado){
        
        this.entityManager.remove(empleado);
        
    }
}
