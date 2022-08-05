package com.mycompany.reto3;

public class Llantas {
    private String marca;
    private char referencia;
    private int peso;
    
    private Llantas(String marca, char referencia, int peso) throws ExcepcionPeso{
        
        if(peso < 0){
            throw new ExcepcionPeso();
        }else{
            this.peso = peso;     
        }
        
        this.marca = marca;
        this.referencia = referencia;
        this.peso = peso;     
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

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
