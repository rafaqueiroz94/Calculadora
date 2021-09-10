package com.example.calculadora.models;

import javax.persistence.*;

@Entity
@Table(name = "Calculadora")
public class CalculadoraEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int valorUm = 0;
    private int valorDois = 0;
    private int resultado = 0;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getValorUm() {
        return valorUm;
    }

    public void setValorUm(int valorUm) {
        this.valorUm = valorUm;
    }

    public int getValorDois() {
        return valorDois;
    }

    public void setValorDois(int valorDois) {
        this.valorDois = valorDois;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public CalculadoraEntity() {
    }

    public CalculadoraEntity(long id, int valorUm, int valorDois, int resultado) {
        this.id = id;
        this.valorUm = valorUm;
        this.valorDois = valorDois;
        this.resultado = resultado;
    }
}
