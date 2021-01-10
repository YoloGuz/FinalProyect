/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.Interceptores;

import com.mycompany.finalproyect.service.EstudianteService;
import javax.annotation.Priority;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import com.mycompany.finalproyect.Interceptores.EstudianteInterceptor;
import java.util.stream.Stream;
import com.mycompany.finalproyect.models.Estudiante;
/**
 *
 * @author reyg6
 */
@Interceptor
@Priority(Interceptor.Priority.APPLICATION)
public class EstudianteInterceptorView {

    @Inject
    private EstudianteService estudianteService; 
            
    
    @EstudianteInterceptor
    @AroundInvoke
    public Object invoke(InvocationContext context) throws Exception{
        
        /**
         * This interceptor allows to review in DB if the student is already there.
         */
        
        Estudiante objeto = (Estudiante) context.getContextData();
        Estudiante est;
        Object obj = null; 
        
        
            est = (Estudiante) this.estudianteService.encontrarEstudiante(objeto.getNoCarnet());
            if(est != null){
            obj = context.proceed();   
                
            }
        return obj;
    }
            
}
