/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.rest;

import com.mycompany.finalproyect.Interceptores.EstudianteInterceptor;
import com.mycompany.finalproyect.models.Estudiante;
import com.mycompany.finalproyect.service.EstudianteService;
import javax.inject.Inject;
import javax.interceptor.Interceptors;
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

@Path("/estudiante")
public class EstudianteEndPoint {
    
    @Inject
    private EstudianteService estudianteService;
    
    @EstudianteInterceptor
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String insertStudent(@Valid Estudiante estudiante){
        
        
            
        
            estudianteService.insertarEstudiante(estudiante);
        
            return "Insertado";
        
    }
    
    @Path("/${idEstudiante}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Estudiante buscarEstudiante(@PathParam ("idEstudiante") int idEstudiante){
        
        Estudiante estudianteEncontrado = new Estudiante();
        
        estudianteEncontrado = this.estudianteService.encontrarEstudiante(idEstudiante);
        
        return estudianteEncontrado;
    }
    
    @Path("/${idEstudiante}")
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public void deleteEstudiante(@PathParam ("idEstudiante") int idEstudiante){
        
        Estudiante student = this.estudianteService.encontrarEstudiante(idEstudiante);
        
        this.estudianteService.borrarEstudiante(student);
        
    }
    
    /**
     * Pendiente update
     */
    
    @Path("/${idEstudiante}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void actualizarEstudiante(@PathParam ("idEstudiante") int idEstudiante){
        
        Estudiante student = this.estudianteService.encontrarEstudiante(idEstudiante);
        
        this.estudianteService.updateStudent(student);
        
    } 
}
