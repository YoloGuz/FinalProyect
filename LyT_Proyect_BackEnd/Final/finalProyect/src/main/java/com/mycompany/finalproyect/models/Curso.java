/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.models;

import java.sql.Time;
import java.util.Date;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author reyg6
 */
@Entity
@Table(name = "curso")
public class Curso {
    
    @Id
    @Column(name = "id_curso")
    private String idCurso;
    
    @Column(name = "dpi")
    private int dpi;
    
    @Column(name = "hora_entrada")
    private Time horaEntrada;
    
    
    @Column(name = "descripcion")
    private String descripcion;
    
    /**
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pk", referencedColumnName = "pk")
    private Horario horarioCurso;
    */
    
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_centro", referencedColumnName = "id_centro")
    private Centro centroCurso;
    
    @ManyToMany
    @JoinTable(
            name = "curso_estudiante",
            joinColumns = @JoinColumn(name = "id_curso", referencedColumnName = "id_curso"),
            inverseJoinColumns = @JoinColumn(name = "no_carne", referencedColumnName = "no_carne")
    )
    private Set<Estudiante> estudianteSet;
    
    /**
    @OneToOne(mappedBy = "dpi", fetch = FetchType.LAZY)
    private Profesor profesor;
    */
    public Centro getCentro() {
        return centroCurso;
    }

    public void setCentro(Centro centro) {
        this.centroCurso = centro;
    }
    
    

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public Time getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Time horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    
/**
    public Horario getHorarioCurso() {
        return horarioCurso;
    }

    public void setHorarioCurso(Horario horarioCurso) {
        this.horarioCurso = horarioCurso;
    }
*/
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.idCurso);
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
        final Curso other = (Curso) obj;
        if (!Objects.equals(this.idCurso, other.idCurso)) {
            return false;
        }
        return true;
    }
    
    
}
