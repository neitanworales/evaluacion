/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neitan.evaluaciones.controllers;

import com.neitan.evaluaciones.data.models.Respuesta;
import com.neitan.evaluaciones.dto.response.ResponseDTO;
import com.neitan.evaluaciones.services.RespuestasService;
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
@RequestMapping("/responder")
public class RespuestasController {

    @Autowired
    RespuestasService respuestaService;
    
    @PostMapping("")
    public ResponseEntity<ResponseDTO> guardarRespuestas(
            @RequestBody Respuesta respuesta) {
        ResponseDTO responseDto = 
                this.respuestaService.guardarRespuestas(respuesta);
        return new ResponseEntity<>(responseDto, HttpStatus.CREATED);
    }

}
