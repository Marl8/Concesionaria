
package com.mycompany.desafio1.Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Auto implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String marca;
    private String modelo;
    private String motor;
    private String color;
    private String patente;
    private String numPuertas;

    public Auto() {
    }

    public Auto(int id, String marca, String modelo, String motor, String color, String patente, String numPuertas) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.color = color;
        this.patente = patente;
        this.numPuertas = numPuertas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(String numPuertas) {
        this.numPuertas = numPuertas;
    }

    
}

    
    

