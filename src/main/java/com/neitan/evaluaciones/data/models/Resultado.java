/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neitan.evaluaciones.data.models;

import javax.persistence.Entity;

/**
 *
 * @author termi
 */
@Entity
public class Resultado extends Respuesta {
    
    private boolean correcto;

    public boolean isCorrecto() {
        return correcto;
    }

    public void setCorrecto(boolean correcto) {
        this.correcto = correcto;
    }
    
}
