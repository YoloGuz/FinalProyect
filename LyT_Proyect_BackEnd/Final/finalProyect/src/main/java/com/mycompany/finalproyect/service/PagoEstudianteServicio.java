/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.service;

import com.mycompany.finalproyect.models.PagoEstudiante;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.core.Response;


/**
 *
 * @author reyg6
 */
@Stateless
public class PagoEstudianteServicio {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    public Response ingresarPago(PagoEstudiante pagoEstudiante){
        
        this.entityManager.persist(pagoEstudiante);
        
        return Response.ok().build();
    }
}
