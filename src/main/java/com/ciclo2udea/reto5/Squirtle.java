package com.ciclo2udea.reto5;

public class Squirtle extends Pokemon {

    String nombre;
    byte nivel;
    int puntajeSalud;
    
    public Squirtle(String nombre, byte nivel, int puntajeSalud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntajeSalud = puntajeSalud;
    }

    @Override
    public Pokemon evolucionar() {
        return new Wartortle(this.nombre, this.nivel, this.puntajeSalud);
    }

    @Override
    public String gritar() {
        return "Squirtle!";
    }
    
}
