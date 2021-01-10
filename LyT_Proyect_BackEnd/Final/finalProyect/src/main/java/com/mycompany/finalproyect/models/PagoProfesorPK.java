/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author reyg6
 */
@Embeddable
public class PagoProfesorPK implements Serializable {
    
    @Column(name = "no_pago")
    private int noPago;
    
    @Column(name = "dpi")
    private long dpi;

    public int getNoPago() {
        return noPago;
    }

    public void setNoPago(int noPago) {
        this.noPago = noPago;
    }

    public long getDpi() {
        return dpi;
    }

    public void setDpi(long dpi) {
        this.dpi = dpi;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + this.noPago;
        hash = 19 * hash + (int) (this.dpi ^ (this.dpi >>> 32));
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
        final PagoProfesorPK other = (PagoProfesorPK) obj;
        if (this.noPago != other.noPago) {
            return false;
        }
        if (this.dpi != other.dpi) {
            return false;
        }
        return true;
    }
    
    
}
