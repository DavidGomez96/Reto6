package com.ciclo2udea.reto5;

public class Charmander extends Pokemon {

    String nombre;
    byte nivel;
    int puntajeSalud;
    
    Charmander(String nombre, byte nivel, int puntajeSalud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntajeSalud = puntajeSalud;
    }
    
    
    
    @Override
    public Pokemon evolucionar() {
        return new Charmeleon(this.nombre, this.nivel, this.puntajeSalud);
    }

    @Override
    public String gritar() {
        return "Charmander!";
    }
    
}
