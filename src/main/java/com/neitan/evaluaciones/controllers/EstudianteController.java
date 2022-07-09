/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neitan.evaluaciones.controllers;

import com.neitan.evaluaciones.data.models.Estudiante;
import com.neitan.evaluaciones.dto.response.EstudianteResponseDTO;
import com.neitan.evaluaciones.dto.response.ResponseDTO;
import com.neitan.evaluaciones.dto.response.ResultadosDTO;
import com.neitan.evaluaciones.services.EstudianteService;
import com.neitan.evaluaciones.services.ExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author termi
 */
@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    
    @Autowired
    EstudianteService estudianteService;
    
    @PostMapping("")
    public ResponseEntity<ResponseDTO> addEstudiante(
            @RequestBody Estudiante estudiante) {
        ResponseDTO respuesta
                = this.estudianteService.crearEstudiante(estudiante);
        return new ResponseEntity<>(respuesta, HttpStatus.CREATED);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<EstudianteResponseDTO> getEstudiante(
            @PathVariable int id) {
        EstudianteResponseDTO respuesta
                = this.estudianteService.getEstudiante(id);
        return new ResponseEntity<>(respuesta, HttpStatus.CREATED);
    }
    
    @GetMapping("/{id}/resultados")
    public ResponseEntity<ResultadosDTO> getResultados(@PathVariable int id) {
        ResultadosDTO respuesta = this.estudianteService.getResultados(id);
        return new ResponseEntity<>(respuesta, HttpStatus.CREATED);
    }
    
}
