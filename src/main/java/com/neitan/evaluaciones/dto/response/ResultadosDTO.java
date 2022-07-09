/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neitan.evaluaciones.dto.response;

import com.neitan.evaluaciones.data.models.Resultado;
import java.util.List;

/**
 *
 * @author termi
 */
public class ResultadosDTO extends ResponseDTO {
    
    List<Resultado> resultados;

    public List<Resultado> getResultados() {
        return resultados;
    }

    public void setResultados(List<Resultado> resultados) {
        this.resultados = resultados;
    }
    
}
