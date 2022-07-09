/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neitan.evaluaciones.dao.impl;

import com.neitan.evaluaciones.dao.EstudianteDao;
import com.neitan.evaluaciones.data.models.Estudiante;
import com.neitan.evaluaciones.data.repository.EstudianteRepository;
import com.neitan.evaluaciones.dto.response.EstudianteResponseDTO;
import com.neitan.evaluaciones.dto.response.ResponseDTO;
import com.neitan.evaluaciones.dto.response.ResultadosDTO;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author termi
 */
@Service
public class EstudianteDaoImpl implements EstudianteDao {

    private final String MENSAJE_CREADO = "Creado correctamente";
    private final String DATOS_OBTENIDOS_OK = "Datos obtenidos correctamente";
    
    @Autowired
    private EstudianteRepository estudianteRepository;
    
    @Override
    public ResponseDTO crearEstudiante(Estudiante estudiante) {
        this.estudianteRepository.save(estudiante);
        ResponseDTO response = new ResponseDTO();
        response.setMensaje(MENSAJE_CREADO);
        return response;
    }

    @Override
    public EstudianteResponseDTO getEstudiante(int id) {
        Optional<Estudiante> search = 
                this.estudianteRepository.findById(id);
        EstudianteResponseDTO response = new EstudianteResponseDTO();
        response.setEstudiante(search.get());
        response.setMensaje(DATOS_OBTENIDOS_OK);
        return response;
    }

    @Override
    public ResultadosDTO getResultados(int id) {
        return null;
    }
    
}
