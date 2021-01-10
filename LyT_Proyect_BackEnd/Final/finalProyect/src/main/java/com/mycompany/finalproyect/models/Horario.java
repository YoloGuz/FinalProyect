/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.models;

import java.io.Serializable;
import java.sql.Time;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.EmbeddedId;
import javax.persistence.OneToMany;
/**
 *
 * @author reyg6
 */
@Entity
@Table (name = "horario")
public class Horario implements Serializable{
    /**
     
    @Id
    @Column(name = "hora_entrada")
    private Time horaEntrada;
    
    @Id
    @Column(name = "hora_salida")
    private Time horaSalida;
    
    @Id
    @Column(name = "dia")
    private String dia;

    public Time getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Time horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Time getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Time horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
    */
    
    @EmbeddedId
    private HorarioPrimaryK pk;

    /**
    @OneToMany(mappedBy = "horarioCurso")
    private List<Curso> listCurso;

    public List<Curso> getListCurso() {
        return listCurso;
    }

    public void setListCurso(List<Curso> listCurso) {
        this.listCurso = listCurso;
    }

    */
    
    public HorarioPrimaryK getPk() {
        return pk;
    }

    public void setPk(HorarioPrimaryK pk) {
        this.pk = pk;
    }
    
    
    
    
}
