package com.example.calculadora.controller;

import com.example.calculadora.Service.CalculadoraService;
import com.example.calculadora.models.CalculadoraEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping ("/api")
@CrossOrigin (origins = "*")
public class CalculadoraController {

    @Autowired
    CalculadoraService service;

    @GetMapping ("/calculos")
    public ResponseEntity buscarCalculos (){
        return ResponseEntity.status(200).body(service.buscarTudo());
    }
    @PostMapping ("/somar")
    public ResponseEntity somar (@RequestBody CalculadoraEntity calculadora){
        return ResponseEntity.status(200).body(service.somar(calculadora));
    }
    @PostMapping ("/subtrair")
    public ResponseEntity subtracao (@RequestBody CalculadoraEntity calculadora){
        return ResponseEntity.status(200).body(service.subtrair(calculadora));
    }
    @PostMapping ("/multiplicar")
    public ResponseEntity multiplicacao (@RequestBody CalculadoraEntity calculadora){
        return ResponseEntity.status(200).body(service.multiplicar(calculadora));
    }
    @PostMapping ("/dividir")
    public ResponseEntity divisao (@RequestBody CalculadoraEntity calculadora){
        return ResponseEntity.status(200).body(service.dividir(calculadora));
    }
}
