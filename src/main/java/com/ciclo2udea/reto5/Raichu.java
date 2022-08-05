package com.ciclo2udea.reto5;

public class Raichu extends Pokemon {

    String nombre;
    byte nivel;
    int puntajeSalud;
    
    public Raichu(String nombre, byte nivel, int puntajeSalud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntajeSalud = puntajeSalud;
    }

    @Override
    public Pokemon evolucionar() {
        try{
            throw new NoEvolucionaException("Este pokemon no puede evolucionar más!");
        }
        catch(Exception e) {
            System.out.println(e.toString());
        }
        return new Raichu(this.nombre, this.nivel, this.puntajeSalud);
    }

    @Override
    public String gritar() {
        return "Raichu!";
    }
    
}

