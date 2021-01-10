/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.models;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
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
@Table(name = "mes")
public class Mes implements Serializable{
    
    @Id
    @Column(name = "mes_pago")        
    private String mesPago;
    
    @OneToMany(mappedBy = "pagoMes")
    private List<Pago> listPago;

    public List<Pago> getListPago() {
        return listPago;
    }

    public void setListPago(List<Pago> listPago) {
        this.listPago = listPago;
    }
    

    
    public String getMesPago() {
        return mesPago;
    }

    public void setMesPago(String mesPago) {
        this.mesPago = mesPago;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.mesPago);
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
        final Mes other = (Mes) obj;
        if (!Objects.equals(this.mesPago, other.mesPago)) {
            return false;
        }
        return true;
    }
    
    
}
