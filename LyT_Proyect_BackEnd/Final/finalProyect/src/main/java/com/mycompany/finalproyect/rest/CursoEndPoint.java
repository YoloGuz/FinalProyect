/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.rest;

import com.mycompany.finalproyect.models.Curso;
import com.mycompany.finalproyect.service.CursoServicio;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author reyg6
 */
@Path("/curso")
public class CursoEndPoint {
    
    @Inject
    private CursoServicio cursoServicio;
    
    @POST

    @Consumes(MediaType.APPLICATION_JSON)
    public void ingresarCurso(@Valid Curso curso){
        
        this.cursoServicio.newCurso(curso);
    }
    
    @GET
    @Path("/${idCurso}")
    public Curso buscarCurso(@PathParam ("idCurso") int idCurso){
        
        Curso curso = this.cursoServicio.buscar(idCurso);
        
        return curso;
    } 
      
}
