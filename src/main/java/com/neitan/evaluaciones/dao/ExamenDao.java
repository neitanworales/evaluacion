/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neitan.evaluaciones.dao;

import com.neitan.evaluaciones.data.models.Examen;
import com.neitan.evaluaciones.dto.response.ResponseDTO;
import org.springframework.stereotype.Component;

/**
 *
 * @author termi
 */
@Component
public interface ExamenDao {
    
    ResponseDTO createExamen(Examen examen);
    
}
