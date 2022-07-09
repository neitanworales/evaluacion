package com.neitan.evaluaciones.data.enums;

/**
 *
 * @author termi
 */
public enum RespuestaEnum {
    
    A("A"),
    B("B"),
    C("C"),
    D("D");
    
    private String respuesta;
    
    private RespuestaEnum(String respuesta){
        this.respuesta = respuesta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
    
}
