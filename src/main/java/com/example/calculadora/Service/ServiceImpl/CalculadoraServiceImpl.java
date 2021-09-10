package com.example.calculadora.Service.ServiceImpl;

import com.example.calculadora.Service.CalculadoraService;
import com.example.calculadora.models.CalculadoraEntity;
import com.example.calculadora.repository.CalculadoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;




@Service
public class CalculadoraServiceImpl implements CalculadoraService {

    @Autowired
    CalculadoraRepository repository;


    @Override
    public List buscarTudo(){
        List us = repository.findAll();
        return us;

    }
    @Override
    public ResponseEntity somar(CalculadoraEntity calculadora){
        CalculadoraEntity user = new CalculadoraEntity();

        int v1,v2, result;

        user.setValorUm(calculadora.getValorUm());
        user.setValorDois(calculadora.getValorDois());

        v1 = user.getValorUm();
        v2 = user.getValorDois();

        result = v1+v2;

        calculadora.setResultado(result);
        repository.save(calculadora);

        return ResponseEntity.ok(result);
    }
    @Override
    public ResponseEntity subtrair (CalculadoraEntity calculadora){
        CalculadoraEntity user = new CalculadoraEntity();

        int v1,v2, result;

        user.setValorUm(calculadora.getValorUm());
        user.setValorDois(calculadora.getValorDois());

        v1 = user.getValorUm();
        v2 = user.getValorDois();

        result = v1-v2;

        calculadora.setResultado(result);
        repository.save(calculadora);

        return ResponseEntity.ok(result);
    }
    @Override
    public ResponseEntity multiplicar (CalculadoraEntity calculadora){
        CalculadoraEntity user = new CalculadoraEntity();

        int v1,v2, result;

        user.setValorUm(calculadora.getValorUm());
        user.setValorDois(calculadora.getValorDois());

        v1 = user.getValorUm();
        v2 = user.getValorDois();

        result = v1*v2;

        calculadora.setResultado(result);
        repository.save(calculadora);

        return ResponseEntity.ok(result);
    }
    @Override
    public ResponseEntity dividir (CalculadoraEntity calculadora){
        CalculadoraEntity user = new CalculadoraEntity();

        int v1,v2, result;

        user.setValorUm(calculadora.getValorUm());
        user.setValorDois(calculadora.getValorDois());

        v1 = user.getValorUm();
        v2 = user.getValorDois();

        result = v1/v2;

        calculadora.setResultado(result);
        repository.save(calculadora);

        return ResponseEntity.ok(result);
    }

}
