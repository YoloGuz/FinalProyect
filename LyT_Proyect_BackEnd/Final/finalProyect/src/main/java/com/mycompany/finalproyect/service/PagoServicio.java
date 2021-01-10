/*

* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.service;

import com.mycompany.finalproyect.models.Pago;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.core.Response;

/**
 *
 * @author reyg6
 */
@Stateless
public class PagoServicio {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    public Response ingresarPago(Pago pago){
        
        this.entityManager.persist(pago);
        
        return Response.ok(pago).build();
    }
    
    
    public void modificarPago(int noPago){
        
        Pago pago = this.buscarPago(noPago);
        
        this.entityManager.merge(pago);
        
    }
    
    private Pago buscarPago(int noPago){
        
        Pago pago = this.entityManager.find(Pago.class, noPago);
        
        return pago;
    }
}
