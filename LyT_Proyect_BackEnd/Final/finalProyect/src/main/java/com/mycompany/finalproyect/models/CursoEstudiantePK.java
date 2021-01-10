/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.models;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author reyg6
 */
@Embeddable
public class CursoEstudiantePK implements  Serializable {
 
    @Column(name = "no_carne")
    private int noCarne;
    
    @Column(name = "id_curso")
    private String idCurso;

    public int getNoCarne() {
        return noCarne;
    }

    public void setNoCarne(int noCarne) {
        this.noCarne = noCarne;
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.noCarne;
        hash = 53 * hash + Objects.hashCode(this.idCurso);
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
        final CursoEstudiantePK other = (CursoEstudiantePK) obj;
        if (this.noCarne != other.noCarne) {
            return false;
        }
        if (!Objects.equals(this.idCurso, other.idCurso)) {
            return false;
        }
        return true;
    }

    
    
}
