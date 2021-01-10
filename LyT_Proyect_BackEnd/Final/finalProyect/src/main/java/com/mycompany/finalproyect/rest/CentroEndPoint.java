/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.rest;

import com.mycompany.finalproyect.models.Centro;
import com.mycompany.finalproyect.models.Estudiante;
import com.mycompany.finalproyect.service.CentroServicio;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author reyg6
 */
@Path("/centro")
public class CentroEndPoint {
    
    @Inject
    private CentroServicio centroServicio;
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void insertarCentro(@Valid Centro centro){
        
        this.centroServicio.insertCentro(centro);
    }
    
    
    @Path("/${idCentro}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Centro buscarCentro(@PathParam ("idCentro") int idCentro){
        
        Centro centroEncontrado = new Centro();
        
        centroEncontrado = this.centroServicio.buscarCentro(idCentro);
        
        return centroEncontrado;
    }
    
    
    @Path("/${idCentro}")
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public void deleteEstudiante(@PathParam ("idCentro") int idCentro){
        
        Centro centro = this.centroServicio.buscarCentro(idCentro);
        
         this.centroServicio.borrarCentro(centro);
        
    }
    
}
