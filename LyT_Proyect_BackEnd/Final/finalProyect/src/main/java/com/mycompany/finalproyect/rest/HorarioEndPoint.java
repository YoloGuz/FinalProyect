/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.rest;

import com.mycompany.finalproyect.models.Horario;
import com.mycompany.finalproyect.service.HorarioServicio;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author reyg6
 */
@Path("/horario")
public class HorarioEndPoint {
    
    
    @Inject
    private HorarioServicio horarioServicio;
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response crearHorario(Horario horario){
        
        this.horarioServicio.crearHorario(horario);
        
        return Response.ok().build();
    }
}

