/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.rest;

import com.mycompany.finalproyect.models.Pago;
import com.mycompany.finalproyect.service.PagoServicio;
import com.mycompany.finalproyect.service.ReciboServicio;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.mail.MessagingException;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author reyg6
 */
@Path("/pago")
public class PagoEndPoint {
    
    @Inject
    private PagoServicio pagoServicio;
    private ReciboServicio reciboServicio;
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void crearPago(@Valid Pago pago){
        
        this.pagoServicio.ingresarPago(pago);
        try {   
            this.reciboServicio.sendEmail(pago);
        } catch (MessagingException ex) {
            Logger.getLogger(PagoEndPoint.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @GET
    @Path("/${noPago}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void modificar(@PathParam ("noPago") int noPago){
        
        this.pagoServicio.modificarPago(noPago);
               
    }
}
