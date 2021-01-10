/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 *
 * @author reyg6
 */
@Entity
@Table(name = "centro")
public class Centro implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_centro")
    @NotNull(message = "centro is null")
    @NotEmpty(message = "centro is empty")
    private int idCentro;
    
    
    @NotNull(message = "centro is null")
    @NotEmpty(message = "centro is empty")
    @Column(name = "nombre_centro")
    private String nombreCentro;
    
    /**
    @NotNull(message = "centro is null")
    @NotEmpty(message = "centro is empty")
    @Column(name = "codigo_estado")
    private int codigoEstado;
    */
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codigo_estado", referencedColumnName = "codigo_estado")
    private Estado estadoCentro;

    
    @OneToMany(mappedBy = "centroCurso")
    private List<Curso> listCentro;
    
    public Estado getEstadoCentro() {
        return estadoCentro;
    }

    public void setEstadoCentro(Estado estadoCentro) {
        this.estadoCentro = estadoCentro;
    }

    
    /**
    public int getCodigoEstado() {
        return codigoEstado;
    }

    public void setCodigoEstado(int codigoEstado) {
        this.codigoEstado = codigoEstado;
    }*/
    
    public int getIdCentro() {
        return idCentro;
    }

    public void setIdCentro(int idCentro) {
        this.idCentro = idCentro;
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public void setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.idCentro;
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
        final Centro other = (Centro) obj;
        if (this.idCentro != other.idCentro) {
            return false;
        }
        return true;
    }
    
    
    
}
