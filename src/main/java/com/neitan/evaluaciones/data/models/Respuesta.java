package com.neitan.evaluaciones.data.models;

import com.neitan.evaluaciones.data.enums.RespuestaEnum;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author termi
 */
@Entity
public class Respuesta implements Serializable {

    @Id
    private Long id;
    
    @ManyToOne
    private Estudiante estudiante;
    @ManyToOne
    private Pregunta pregunta;
    private RespuestaEnum respuesta;

    public Pregunta getPregunta() {
        return pregunta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public RespuestaEnum getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(RespuestaEnum respuesta) {
        this.respuesta = respuesta;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
