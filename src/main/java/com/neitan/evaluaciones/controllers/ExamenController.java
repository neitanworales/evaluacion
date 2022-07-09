/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neitan.evaluaciones.controllers;

import com.neitan.evaluaciones.data.models.Examen;
import com.neitan.evaluaciones.dto.response.ResponseDTO;
import com.neitan.evaluaciones.services.ExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author termi
 */
@RestController
@RequestMapping("/examenes")
public class ExamenController {
    
    @Autowired
    ExamenService examenService;
    
    @PostMapping("")
    public ResponseEntity<ResponseDTO> createExamen(
            @RequestBody Examen examen) {
        ResponseDTO respuesta = this.examenService.createExamen(examen);
        return new ResponseEntity<>(respuesta, HttpStatus.CREATED);
    }
    
}
