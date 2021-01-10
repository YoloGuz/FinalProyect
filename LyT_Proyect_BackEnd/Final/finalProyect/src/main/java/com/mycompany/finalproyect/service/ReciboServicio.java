/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.service;

import com.mycompany.finalproyect.models.Pago;
import com.sun.istack.logging.Logger;
import java.util.logging.Level;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author reyg6
 */
@Stateless
public class ReciboServicio {
    
    @Resource(mappedName = "java:/jboss/mail/suertudo_viajero")
    private Session session;
    
    public void sendEmail(Pago pago) throws MessagingException{
        
        String content = "<h1> Enviamos correo del pago del mes de... </h1> ";
        
        try{
            MimeMessage message = new MimeMessage(session);
            message.setHeader("Content-Type", "text/html;charset=UTF-8");
            
            message.setFrom(new InternetAddress("estuPrueba1989@gmail.com"));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress("reyg.61189@gmail.com"));
            message.setSubject("Recibo de pago", "UTF-8");
            message.setContent( content, "text/html;charset=UTF-8");
            
            Transport.send(message);
        }catch(MessagingException ex){
            System.out.print(ex.getMessage());
        }
        
    }
}
