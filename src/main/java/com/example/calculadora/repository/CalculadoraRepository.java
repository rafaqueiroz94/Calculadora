package com.example.calculadora.repository;

import com.example.calculadora.models.CalculadoraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalculadoraRepository extends JpaRepository<CalculadoraEntity, Long> {

}
