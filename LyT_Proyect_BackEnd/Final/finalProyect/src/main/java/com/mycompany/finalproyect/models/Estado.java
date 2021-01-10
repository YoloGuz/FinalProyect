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
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author reyg6
 */
@Entity
@Table(name = "estado")
public class Estado implements Serializable{
    
    @Id
    @Column(name = "codigo_estado")
    private int codigoEstado;
    
    @Column(name = "descripcion_estado")
    private String descripcionEstado;
    
    @OneToMany(mappedBy = "estadoEmpleado")
    private List<Empleado> listEmpleado;

    
    @OneToMany(mappedBy = "estadoProfesor")
    private List<Profesor> listProfesor;
    
    @OneToMany(mappedBy = "estadoEstudiante")
    private List<Estudiante> listEstudiante;
    
    @OneToMany(mappedBy = "estadoCentro")
    private List<Centro> listCentro;
    
    
    public List<Empleado> getListEmpleado() {
        return listEmpleado;
    }

    public void setListEmpleado(List<Empleado> listEmpleado) {
        this.listEmpleado = listEmpleado;
    }

    

    public int getCodigoEstado() {
        return codigoEstado;
    }

    public void setCodigoEstado(int codigoEstado) {
        this.codigoEstado = codigoEstado;
    }

    public String getDescripcionEstado() {
        return descripcionEstado;
    }

    public void setDescripcionEstado(String descripcionEstado) {
        this.descripcionEstado = descripcionEstado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.codigoEstado;
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
        final Estado other = (Estado) obj;
        if (this.codigoEstado != other.codigoEstado) {
            return false;
        }
        return true;
    }
    
    
}
