/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neitan.evaluaciones.data.repository;

import com.neitan.evaluaciones.data.models.Estudiante;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author termi
 */
public interface EstudianteRepository 
        extends CrudRepository<Estudiante, Integer> {
    
}
