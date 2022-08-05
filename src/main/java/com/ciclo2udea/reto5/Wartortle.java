package com.ciclo2udea.reto5;

public class Wartortle extends Pokemon {

    String nombre;
    byte nivel;
    int puntajeSalud;
    
    public Wartortle(String nombre, byte nivel, int puntajeSalud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntajeSalud = puntajeSalud;
    }

    @Override
    public Pokemon evolucionar() {
        return new Blastoise(this.nombre, this.nivel, this.puntajeSalud);
    }

    @Override
    public String gritar() {
        return "Wartortle!";
    }
    
}
