package com.ciclo2udea.reto5;

public class Reto5 {

    public static void main(String[] args) {
        Pokemon pokemon1 = new Charmander("Pokemon1", (byte) 0.0, 10);
        Pokebola pokebola1 = new Pokebola("grande", pokemon1);
        System.out.println(pokemon1.gritar());
        System.out.println(pokebola1.escribirPokemon());
        pokebola1.pokemonAtrapado = pokebola1.pokemonAtrapado.evolucionar();
        pokemon1 = pokemon1.evolucionar();
        System.out.println(pokemon1.gritar());
        System.out.println(pokebola1.escribirPokemon());
        pokebola1.pokemonAtrapado = pokebola1.pokemonAtrapado.evolucionar();
        pokemon1 = pokemon1.evolucionar();
        System.out.println(pokemon1.gritar());
        System.out.println(pokebola1.escribirPokemon());
        pokebola1.pokemonAtrapado = pokebola1.pokemonAtrapado.evolucionar();
        pokemon1 = pokemon1.evolucionar();
        System.out.println(pokemon1.gritar());
        System.out.println(pokebola1.escribirPokemon());
        System.out.println("");
        System.out.println("");
        
        Pokemon pokemon2 = new Pikachu("Pokemon2", (byte) 0.0, 10);
        Pokebola pokebola2 = new Pokebola("mediana", pokemon2);
        System.out.println(pokemon2.gritar());
        System.out.println(pokebola2.escribirPokemon());
        pokebola2.pokemonAtrapado = pokebola2.pokemonAtrapado.evolucionar();
        pokemon2 = pokemon2.evolucionar();
        System.out.println(pokemon2.gritar());
        System.out.println(pokebola2.escribirPokemon());
        pokebola2.pokemonAtrapado = pokebola2.pokemonAtrapado.evolucionar();
        pokemon2 = pokemon2.evolucionar();
        System.out.println(pokemon2.gritar());
        System.out.println(pokebola2.escribirPokemon());
        System.out.println("");
        System.out.println("");
        
        Pokemon pokemon3 = new Squirtle("Pokemon3", (byte) 0.0, 10);
        Pokebola pokebola3 = new Pokebola("pequeña", pokemon3);
        System.out.println(pokemon3.gritar());
        System.out.println(pokebola3.escribirPokemon());
        pokebola3.pokemonAtrapado = pokebola3.pokemonAtrapado.evolucionar();
        pokemon3 = pokemon3.evolucionar();
        System.out.println(pokemon3.gritar());
        System.out.println(pokebola3.escribirPokemon());
        pokebola3.pokemonAtrapado = pokebola3.pokemonAtrapado.evolucionar();
        pokemon3 = pokemon3.evolucionar();
        System.out.println(pokemon3.gritar());
        System.out.println(pokebola3.escribirPokemon());
        pokebola3.pokemonAtrapado = pokebola3.pokemonAtrapado.evolucionar();
        pokemon3 = pokemon3.evolucionar();
        System.out.println(pokemon3.gritar());
        System.out.println(pokebola3.escribirPokemon());
    }
}
