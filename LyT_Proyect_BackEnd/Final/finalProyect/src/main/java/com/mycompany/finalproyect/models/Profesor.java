/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.models;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 *
 * @author reyg6
 */
@Entity
@Table(name = "profesor")
public class Profesor implements Serializable {
    
    
    @NotNull(message = "profesor is null")
    @NotEmpty(message = "profesor is empty")
    @Id
    @Column(name = "dpi")
    private int dpi;
    
    @NotNull(message = "nombre is null")
    @NotEmpty(message = "nombre is empty")
    @Column(name = "nombre_profesor")
    private String nombreProfesor;
    
    
    @NotNull(message = "apellido is null")
    @NotEmpty(message = "apellido is empty")
    @Column(name = "apellido_profesor")
    private String apellidoProfesor;
    
    
    @NotNull(message = "email is null")
    @NotEmpty(message = "email is empty")
    @Column(name = "email_profesor")
    private String emailProfesor;
    
    
    @NotNull(message = "telefono is null")
    @NotEmpty(message = "telefono is empty")
    @Column(name = "telefono_profesor")
    private int telefonoProfesor;
    /**
    @NotNull(message = "estado is null")
    @NotEmpty(message = "estado is empty")
    @Column(name = "codigo_estado")
    private int codigoEstado;
    */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codigo_estado", referencedColumnName = "codigo_estado")
    private Estado estadoProfesor;
    
    @OneToOne
    @JoinColumn(name = "id_curso", referencedColumnName = "id_curso")
    private Curso curso;

    public Estado getEstadoProfesor() {
        return estadoProfesor;
    }

    public void setEstadoProfesor(Estado estadoProfesor) {
        this.estadoProfesor = estadoProfesor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Set<Pago> getPagoSet() {
        return pagoSet;
    }

    public void setPagoSet(Set<Pago> pagoSet) {
        this.pagoSet = pagoSet;
    }
    
    
    
    
    @ManyToMany(mappedBy = "profesorSet")
    private Set<Pago> pagoSet;

    /**
    public int getCodigoEstado() {
        return codigoEstado;
    }

    public void setCodigoEstado(int codigoEstado) {
        this.codigoEstado = codigoEstado;
    }*/

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getApellidoProfesor() {
        return apellidoProfesor;
    }

    public void setApellidoProfesor(String apellidoProfesor) {
        this.apellidoProfesor = apellidoProfesor;
    }

    public String getEmailProfesor() {
        return emailProfesor;
    }

    public void setEmailProfesor(String emailProfesor) {
        this.emailProfesor = emailProfesor;
    }

    public int getTelefonoProfesor() {
        return telefonoProfesor;
    }

    public void setTelefonoProfesor(int telefonoProfesor) {
        this.telefonoProfesor = telefonoProfesor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (this.dpi ^ (this.dpi >>> 32));
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
        final Profesor other = (Profesor) obj;
        if (this.dpi != other.dpi) {
            return false;
        }
        return true;
    }
    
    
    
}
