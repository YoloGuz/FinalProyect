/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.service;

import javax.ejb.Stateless;
import javax.inject.Inject;
import com.mycompany.finalproyect.models.CustomeMsg;
import javax.annotation.Resource;
import javax.jms.ConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.JMSProducer;
import javax.jms.Queue;

/**
 *
 * @author reyg6
 */
@Stateless
public class ProducerService {
    
    @Resource(mappedName = "java:/jms/queue/suertudo")
    private Queue messageQueue;
    
    @Resource(mappedName = "java:/ConnectionFactory")
    private ConnectionFactory connection;
    
    public void createMessage(CustomeMsg customMsg){
        
        JMSContext context = connection.createContext();
        JMSProducer producer = context.createProducer();
        
        producer.send(messageQueue, customMsg);
    }
    
}
