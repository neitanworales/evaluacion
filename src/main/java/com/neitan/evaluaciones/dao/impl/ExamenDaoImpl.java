/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neitan.evaluaciones.dao.impl;

import com.neitan.evaluaciones.dao.*;
import com.neitan.evaluaciones.data.models.Examen;
import com.neitan.evaluaciones.data.repository.ExamenRepository;
import com.neitan.evaluaciones.dto.response.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author termi
 */
@Service
public class ExamenDaoImpl implements ExamenDao {

    private final String MENSAJE_CREADO = "Creado correctamente";
   
    @Autowired
    private ExamenRepository examenRepository;
    
    @Override
    public ResponseDTO createExamen(Examen examen) {
        this.examenRepository.save(examen);
        ResponseDTO response = new ResponseDTO();
        response.setMensaje(MENSAJE_CREADO);
        return response;
    }
    
}
