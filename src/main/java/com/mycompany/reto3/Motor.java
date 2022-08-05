package com.mycompany.reto3;

public class Motor {
    private int cilindraje;
    private String marca;
    private char referencia;
    private float peso;
    private String descripcion;

    public Motor(int cilindraje, String marca, char referencia, float peso, String descripcion) throws ExcepcionPeso{
        
        if(peso < 0){
            throw new ExcepcionPeso();
        }else{
            this.peso = peso;

        }
        
        this.cilindraje = cilindraje;
        this.marca = marca;
        this.referencia = referencia;
        this.descripcion = descripcion;       
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public char getReferencia() {
        return referencia;
    }

    public void setReferencia(char referencia) {
        this.referencia = referencia;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }    
  }
