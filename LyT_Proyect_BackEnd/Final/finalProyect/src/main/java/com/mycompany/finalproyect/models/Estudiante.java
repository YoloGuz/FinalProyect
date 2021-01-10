/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 *
 * @author reyg6
 */
@Entity
@Table(name = "estudiante")
public class Estudiante implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no_carne")
    @NotNull(message = "noCarnet is null")
    @NotEmpty(message = "noCarnet is empty")
    private int noCarnet;
    
    /**
    @NotEmpty(message = "codigoEstado is empty")
    @Column(name = "codigo_estado")
    private boolean codigoEstado;
    */
    
    @NotNull(message = "nombre estudiante is null")
    @NotEmpty(message = "nombre estudiante is empty")
    @Column(name = "nombre_estudiante")
    private String nombreEstudiante;
    
    
    @NotNull(message = "apellido estudiante is null")
    @NotEmpty(message = "apellido estudiante is empty")
    @Column(name = "apellido_estudiante")
    private String apellidoEstudiante;
    
    
    @NotNull(message = "telefono estudiante is null")
    @NotEmpty(message = "telefono estudiante is empty")
    @Column(name = "telefono_estudiante")
    private int telefonoEstudiante;
    
    
    @NotNull(message = "email estudiante is null")
    @NotEmpty(message = "email estudiante is empty")
    @Column(name = "email_estudiante")
    private String emailEstudiante;
    
    @Column(name = "fecha_ingreso")
    private Date fechaIngreso;

    public Estado getEstadoEstudiante() {
        return estadoEstudiante;
    }

    public void setEstadoEstudiante(Estado estadoEstudiante) {
        this.estadoEstudiante = estadoEstudiante;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codigo_estado", referencedColumnName = "codigo_estado")
    private Estado estadoEstudiante;
    
    
    @ManyToMany(mappedBy = "estudianteSet")
    private Set<Pago> pagoSet;

    
    @ManyToMany(mappedBy = "estudianteSet")
    private Set<Curso> cursoSet;
    
    
    public int getNoCarnet() {
        return noCarnet;
    }

    public void setNoCarnet(int noCarnet) {
        this.noCarnet = noCarnet;
    }

    /**
    public boolean isCodigoEstado() {
        return codigoEstado;
    }

    public void setCodigoEstado(boolean codigoEstado) {
        this.codigoEstado = codigoEstado;
    }*/

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getApellidoEstudiante() {
        return apellidoEstudiante;
    }

    public void setApellidoEstudiante(String apellidoEstudiante) {
        this.apellidoEstudiante = apellidoEstudiante;
    }

    public int getTelefonoEstudiante() {
        return telefonoEstudiante;
    }

    public void setTelefonoEstudiante(int telefonoEstudiante) {
        this.telefonoEstudiante = telefonoEstudiante;
    }

    public String getEmailEstudiante() {
        return emailEstudiante;
    }

    public void setEmailEstudiante(String emailEstudiante) {
        this.emailEstudiante = emailEstudiante;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.noCarnet;
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
        final Estudiante other = (Estudiante) obj;
        if (this.noCarnet != other.noCarnet) {
            return false;
        }
        return true;
    }
    
    
    
}
