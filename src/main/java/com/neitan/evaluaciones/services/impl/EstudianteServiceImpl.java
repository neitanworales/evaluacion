/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neitan.evaluaciones.services.impl;

import com.neitan.evaluaciones.dao.EstudianteDao;
import com.neitan.evaluaciones.data.models.Estudiante;
import com.neitan.evaluaciones.dto.response.EstudianteResponseDTO;
import com.neitan.evaluaciones.dto.response.ResponseDTO;
import com.neitan.evaluaciones.dto.response.ResultadosDTO;
import com.neitan.evaluaciones.services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author termi
 */
@Service
public class EstudianteServiceImpl implements EstudianteService {

    @Autowired
    EstudianteDao estudianteDao;
    
    @Override
    public ResponseDTO crearEstudiante(Estudiante estudiante) {
        return this.estudianteDao.crearEstudiante(estudiante);
    }

    @Override
    public EstudianteResponseDTO getEstudiante(int id) {
        return this.estudianteDao.getEstudiante(id);
    }

    @Override
    public ResultadosDTO getResultados(int id) {
        return this.estudianteDao.getResultados(id);
    }

}
