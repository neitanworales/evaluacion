/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neitan.evaluaciones.services;

import com.neitan.evaluaciones.data.models.Estudiante;
import com.neitan.evaluaciones.dto.response.EstudianteResponseDTO;
import com.neitan.evaluaciones.dto.response.ResponseDTO;
import com.neitan.evaluaciones.dto.response.ResultadosDTO;
import org.springframework.stereotype.Component;

/**
 *
 * @author termi
 */
@Component
public interface EstudianteService {

    ResponseDTO crearEstudiante(Estudiante estudiante);

    EstudianteResponseDTO getEstudiante(int id);

    ResultadosDTO getResultados(int id);
}
