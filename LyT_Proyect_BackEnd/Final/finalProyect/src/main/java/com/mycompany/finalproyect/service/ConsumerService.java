/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.service;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

/**
 *
 * @author reyg6
 */
@MessageDriven( activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
    @ActivationConfigProperty(propertyName = "destination", propertyValue = "java:/jms/queue/suertudo")})
public class ConsumerService implements MessageListener {

    @Override
    public void onMessage(Message message) {
        
        try{
            ObjectMessage objectMessage = (ObjectMessage) message;
            System.out.println(objectMessage.getObject());
        }catch(JMSException ex){
            Logger.getLogger(ConsumerService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
