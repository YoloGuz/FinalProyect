/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.models;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author reyg6
 */
@Entity
@Table(name = "pago_estudiante")
public class PagoEstudiante implements Serializable{
    
    @EmbeddedId
    private PagoEstudiantePK pk;

    public PagoEstudiantePK getPk() {
        return pk;
    }

    public void setPk(PagoEstudiantePK pk) {
        this.pk = pk;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.pk);
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
        final PagoEstudiante other = (PagoEstudiante) obj;
        if (!Objects.equals(this.pk, other.pk)) {
            return false;
        }
        return true;
    }
    
    
    
}
