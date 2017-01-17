package poke.controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import poke.model.Pokemon;
import poke.model.pokemon.Blaziken;
import poke.model.pokemon.Geodude;
import poke.model.pokemon.Mudkip;
import poke.model.pokemon.Turtwig;
import poke.model.pokemon.Squirtle;
import poke.view.PokemonFrame;

public class PokemonController {
	
	private PokemonFrame pokemonFrame;
	private ArrayList<Pokemon> pokedex;
	
	public PokemonController(){
		this.pokedex = new ArrayList<Pokemon>();
		this.buildPokedex();
		pokemonFrame = new PokemonFrame(this);
	}
	
	public void start(){
		
	}
	
	public void buildPokedex(){
		pokedex.add(new Blaziken("Glorified Chicken"));
		pokedex.add(new Geodude("Rock man"));
		pokedex.add(new Mudkip("mud salamander"));
		pokedex.add(new Turtwig("tree turtle"));
		pokedex.add(new Squirtle("super Turtle"));
		pokedex.add(new Squirtle("water guy"));
	}

	public String[] buildPokedexText() {
		String[] pokemonNames = new String[pokedex.size()];
		for(int index = 0; index < pokedex.size(); index++){
			Pokemon pokemon = pokedex.get(index);
			pokemonNames[index] = pokemon.getName() + " - " + pokemon.getNickName();
		}
		return pokemonNames;
	}
	
	public void updateSelected(int index, String name, int health, int defense){
		Pokemon pokemon = pokedex.get(index);
		pokemon.setNickName(name);
		pokemon.setHealthPoints(health);
		pokemon.setDefensePoints(defense);
	}
	
	public ArrayList<Pokemon> getPokedex(){
		return this.pokedex;
	}
	
	public PokemonFrame getBaseFrame(){
		return this.pokemonFrame;
	}

	public void updateSelected(int i, String string, int j, int k, double d) {
		
	}

}