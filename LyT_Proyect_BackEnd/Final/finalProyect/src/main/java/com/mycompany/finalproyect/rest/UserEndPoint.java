/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.rest;

import com.mycompany.finalproyect.models.UserSign;
import com.mycompany.finalproyect.service.UserServicio;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author reyg6
 */
@Path("/user")
public class UserEndPoint {
    
    @Inject
    private UserServicio userServicio;
    
    
    /**
     * When we want to use the BeanValidation tiene que ser en POST
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public UserSign reviewUser(@Valid UserSign userSign){
        
        UserSign res =(UserSign) this.userServicio.mostrandoUser(userSign);
        
        return res;
    }
}
