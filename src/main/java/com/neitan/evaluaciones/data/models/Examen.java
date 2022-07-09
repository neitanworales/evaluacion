package com.neitan.evaluaciones.data.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author termi
 */
@Entity
public class Examen implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private LocalDateTime fechaHoraAplicacion;
    
    @OneToMany
    private List<Pregunta> preguntas;

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public LocalDateTime getFechaHoraAplicacion() {
        return fechaHoraAplicacion;
    }

    public void setFechaHoraAplicacion(LocalDateTime fechaHoraAplicacion) {
        this.fechaHoraAplicacion = fechaHoraAplicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
