/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;


/**
 *
 * @author reyg6
 */
@Embeddable
public class PagoEstudiantePK implements Serializable {
    
    @Column(name = "no_carne")
    private int noCarne;
    
    @Column(name = "no_pago")
    private int noPago;

    public int getNoCarne() {
        return noCarne;
    }

    public void setNoCarne(int noCarne) {
        this.noCarne = noCarne;
    }

    public int getNoPago() {
        return noPago;
    }

    public void setNoPago(int noPago) {
        this.noPago = noPago;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.noCarne;
        hash = 83 * hash + this.noPago;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PagoEstudiantePK other = (PagoEstudiantePK) obj;
        if (this.noCarne != other.noCarne) {
            return false;
        }
        if (this.noPago != other.noPago) {
            return false;
        }
        return true;
    }
    
    
    
}
