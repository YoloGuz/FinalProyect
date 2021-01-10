/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.rest;

import com.mycompany.finalproyect.models.Profesor;
import com.mycompany.finalproyect.service.ProfesorServicio;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author reyg6
 */
@Path("/profesor")
public class ProfesorEndPoint {
    
    @Inject
    private ProfesorServicio profesorServicio;
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void insertProfesor(@Valid Profesor profesor){
        
        this.profesorServicio.insertarProfesor(profesor);
        
    }
    
    @Path("/${dpi}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Profesor buscarProfesor(@PathParam ("dpi") int dpi){
        
        Profesor profesorEncontrado = new Profesor();
        
        profesorEncontrado = this.profesorServicio.encontrarProfesor(dpi);
        
        return profesorEncontrado;
    }
    
     
    @Path("/${dpi}")
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public void deleteProfesor(@PathParam ("dpi") int dpi){
        
        Profesor profe = this.profesorServicio.encontrarProfesor(dpi);
        
        this.profesorServicio.borrarProfesor(profe);
        
    }
    
    @Path("/${dpi}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void actualizarProfesor(@PathParam ("dpi") int dpi){
        
        Profesor profesor = this.profesorServicio.encontrarProfesor(dpi);
        
        this.profesorServicio.updateProfesor(profesor);
        
    }
    
}
