package com.example.calculadora.Service;

import com.example.calculadora.models.CalculadoraEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CalculadoraService {


//    CalculadoraEntity salvarCalculo(CalculadoraEntity calculadoraEntity);

    List buscarTudo();

    ResponseEntity somar(CalculadoraEntity calculadora);

    ResponseEntity subtrair(CalculadoraEntity calculadora);

    ResponseEntity multiplicar(CalculadoraEntity calculadora);

    ResponseEntity dividir(CalculadoraEntity calculadora);
}
