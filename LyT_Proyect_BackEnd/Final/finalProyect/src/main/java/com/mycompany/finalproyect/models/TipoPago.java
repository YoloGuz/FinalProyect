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
@Table(name = "tipo_pago")
public class TipoPago implements Serializable{
    
    @Id
    @Column(name = "tipo_pago")
    private String tipo_Pago;
    
    @OneToMany(mappedBy = "tipoPagoC")
    private List<Pago> listPago;

    public List<Pago> getListPago() {
        return listPago;
    }

    public void setListPago(List<Pago> listPago) {
        this.listPago = listPago;
    }
    
    public String getTipoPago() {
        return tipo_Pago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipo_Pago = tipoPago;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.tipo_Pago);
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
        final TipoPago other = (TipoPago) obj;
        if (!Objects.equals(this.tipo_Pago, other.tipo_Pago)) {
            return false;
        }
        return true;
    }
    
    
}
