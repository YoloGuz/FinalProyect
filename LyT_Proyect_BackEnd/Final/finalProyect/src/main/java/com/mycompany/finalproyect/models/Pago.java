/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author reyg6
 */
@Entity
@Table(name = "pago")
public class Pago implements Serializable{
    
    @Id
    @Column(name = "no_pago")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int noPago;
    
    @Column(name = "fecha_pago")
    private Date fechaPago;
    
    
    @Column(name = "cantidad")
    private BigDecimal cantidad;
    /**
    @Column(name = "tipo_pago")
    private String tipoPagoDato;
    * 
    * 
    @Column(name = "mes_pago")
    private String mesPago;
    */
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_pago", referencedColumnName = "tipo_pago")
    private TipoPago tipoPagoC;

    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mes_pago", referencedColumnName = "mes_pago")
    private Mes pagoMes;

    @ManyToMany
    @JoinTable(
            name = "pago_profesor",
            joinColumns = @JoinColumn(name = "no_pago", referencedColumnName = "no_pago"),
            inverseJoinColumns = @JoinColumn(name = "dpi", referencedColumnName = "dpi")
    )
    private Set<Profesor> profesorSet;
    
    
    @ManyToMany
    @JoinTable(
            name = "pago_estudiante",
            joinColumns = @JoinColumn(name = "no_pago", referencedColumnName = "no_pago"),
            inverseJoinColumns = @JoinColumn(name = "no_carne", referencedColumnName = "no_carne")
    )
    private Set<Estudiante> estudianteSet;
    

    public Set<Profesor> getProfesorSet() {
        return profesorSet;
    }

    public void setProfesorSet(Set<Profesor> profesorSet) {
        this.profesorSet = profesorSet;
    }
    
    
    public Mes getPagoMes() {
        return pagoMes;
    }

    public void setPagoMes(Mes pagoMes) {
        this.pagoMes = pagoMes;
    }
    
    
    public TipoPago getTipoPagoC() {
        return tipoPagoC;
    }

    public void setTipoPagoC(TipoPago tipoPagoC) {
        this.tipoPagoC = tipoPagoC;
    }
   
    public int getNoPago() {
        return noPago;
    }

    public void setNoPago(int noPago) {
        this.noPago = noPago;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    /**
    public String getTipoPago() {
        return tipoPagoDato;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPagoDato = tipoPago;
    }
    */
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.noPago;
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
        final Pago other = (Pago) obj;
        if (this.noPago != other.noPago) {
            return false;
        }
        return true;
    }
    
    
}
