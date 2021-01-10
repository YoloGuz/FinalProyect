/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.service;

import com.mycompany.finalproyect.models.Centro;
import com.mycompany.finalproyect.models.Estudiante;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author reyg6
 */
@Stateless
public class CentroServicio {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    public Response insertCentro(Centro centro){
        
        this.entityManager.persist(centro);
        
        return Response.ok().build();
    }
    
    public Centro buscarCentro(int idCentro){
        
        Centro centroE = new Centro();
        
        centroE = this.entityManager.find(Centro.class, idCentro);
        
        return centroE;
    }
    
    
    public Response borrarCentro(Centro centro){
        
        this.entityManager.remove(centro);
        
        return Response.ok().build();
    }
    
}
