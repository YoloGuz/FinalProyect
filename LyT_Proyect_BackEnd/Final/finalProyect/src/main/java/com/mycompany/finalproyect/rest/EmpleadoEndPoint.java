/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.rest;

import com.mycompany.finalproyect.models.Empleado;
import com.mycompany.finalproyect.service.EmpleadoServicio;
import com.mycompany.finalproyect.service.ProducerService;
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
import javax.ws.rs.core.Response;
import com.mycompany.finalproyect.models.CustomeMsg;
/**
 *
 * @author reyg6
 */
@Path("/empleado")
public class EmpleadoEndPoint {
    
    @Inject
    private EmpleadoServicio empleadoServicio;
    private ProducerService producerService;
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response crearEmpleado(@Valid Empleado empleado){
        
        CustomeMsg customMsg = new CustomeMsg();
        customMsg.setTitulo("1");
        customMsg.setContenido("Hola, se creo un empleado!");
        
        this.empleadoServicio.insertarEmpleado(empleado);
        this.producerService.createMessage(customMsg);
        return Response.ok().build();
    }
    
    @Path("/${codigoEmpleado}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Empleado buscarEmpleado(@PathParam ("codigoEmpleado") int codigoEmpleado){
        
        
        Empleado empleado = new Empleado();
        
        empleado = this.empleadoServicio.encontrarEmpleado(codigoEmpleado);
        
        
        return empleado;
    }
    
    @Path("/${codigoEmpleado}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void actualizarEmpleado(@PathParam ("codigoEmpleado") int codigoEmpleado){
        
        Empleado empleado = this.empleadoServicio.encontrarEmpleado(codigoEmpleado);
        
        this.empleadoServicio.updateEmpleado(empleado);
        
    }
    
    @Path("/${codigoEmpleado}")
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public void borrarEmpleado(@PathParam ("codigoEmpleado") int codigoEmpleado){
        
        Empleado empleado = this.empleadoServicio.encontrarEmpleado(codigoEmpleado);
        
        this.empleadoServicio.borrarEmpleado(empleado);
        
        
    }
    
}
