/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 *
 * @author reyg6
 */
@Entity
@Table(name = "empleado")
public class Empleado implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoEmpleado")
    @NotNull(message = "codigo is null")
    @NotEmpty(message = "codigo is empty")
    private int codigoEmpleado;

    @Column(name = "nombreEmpleado")
    @NotNull(message = "nombre is null")
    @NotEmpty(message = "nombre is empty")
    private String nombreEmpleado;

    @Column(name = "usuarioEmpleado")
    @NotNull(message = "usuario is null")
    @NotEmpty(message = "usuario is empty")
    private String usuarioEmpleado;

    @Column(name = "passwordEmpleado")
    @NotNull(message = "password is null")
    @NotEmpty(message = "password is empty")
    private String passwordEmpleado;

    @Column(name = "telefonoEmpleado")
    @NotNull(message = "telefono is null")
    @NotEmpty(message = "telefono is empty")
    private String telefonoEmpleado;

    @Column(name = "correoElectronicoEmpleado")
    @NotNull(message = "correo is null")
    @NotEmpty(message = "correo is empty")
    private String correoEmpleado;

    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codigo_estado", referencedColumnName = "codigo_estado")
    private Estado estadoEmpleado;

    public Estado getEstadoEmpleado() {
        return estadoEmpleado;
    }

    public void setEstadoEmpleado(Estado estadoEmpleado) {
        this.estadoEmpleado = estadoEmpleado;
    }
    
    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getUsuarioEmpleado() {
        return usuarioEmpleado;
    }

    public void setUsuarioEmpleado(String usuarioEmpleado) {
        this.usuarioEmpleado = usuarioEmpleado;
    }

    public String getPasswordEmpleado() {
        return passwordEmpleado;
    }

    public void setPasswordEmpleado(String passwordEmpleado) {
        this.passwordEmpleado = passwordEmpleado;
    }

    public String getTelefonoEmpleado() {
        return telefonoEmpleado;
    }

    public void setTelefonoEmpleado(String telefonoEmpleado) {
        this.telefonoEmpleado = telefonoEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.codigoEmpleado;
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
        final Empleado other = (Empleado) obj;
        if (this.codigoEmpleado != other.codigoEmpleado) {
            return false;
        }
        return true;
    }
    


}



