package com.ciclo2udea.reto5;

public class Pokebola {
    String tamaño;
    Pokemon pokemonAtrapado;
    
    Pokebola(String tamaño, Pokemon pokemonAtrapado) {
        this.tamaño = tamaño;
        this.pokemonAtrapado = pokemonAtrapado;
    }
    
    public String escribirPokemon() {
        return "El pokemon atrapado es del tipo: " + pokemonAtrapado.gritar();
    }
    
}
