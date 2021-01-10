/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.service;

import com.mycompany.finalproyect.models.Empleado;
import com.mycompany.finalproyect.models.UserSign;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;


/**
 *
 * @author reyg6
 */
@Stateless
public class UserServicio {
    
    @PersistenceContext
    private EntityManager entityManager; 
    
    public UserSign mostrandoUser(UserSign userSign){
        
     CriteriaBuilder builder = entityManager.getCriteriaBuilder();
       
     CriteriaQuery<Empleado> query = builder.createQuery(Empleado.class);
     
     query.from(Empleado.class);
     
     List<Empleado> userList = entityManager.createQuery(query).getResultList();
     
     for(int i = 0; i < userList.size(); i++){
         if(userList.get(i).getUsuarioEmpleado().equals(userSign.getUsername()) && 
                 userList.get(i).getPasswordEmpleado().equals(userSign.getPassword())){       
             return userSign;
         }
     }
     
     return null;

    }
}
