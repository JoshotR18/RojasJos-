/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coche;

/**
 *
 * @author José
 */
public class Coche {
    private int id;
    private String marca;
    private String modelo;
    private int ano;
    private String tipo;
    private String numeroChasis;
    private String color;

    public Coche(int id, String marca, String modelo, int ano, String tipo, String numeroChasis, String color) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.tipo = tipo;
        this.numeroChasis = numeroChasis;
        this.color = color;
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
    public int getAno() {
        return ano; 
    }
    public void setAno(int ano) {
        this.ano = ano; 
    }
    public String getTipo() {
        return tipo; 
    }
    public void setTipo(String tipo){
        this.tipo = tipo; 
    }
    public String getNumeroChasis() {
        return numeroChasis; 
    }
    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }
    public String getColor() {
        return color; 
    }
    public void setColor(String color) {
        this.color = color;
    }
}