package poke.model.pokemon;

import poke.model.Pokemon;
import poke.model.types.Rock;
import poke.model.types.Water;

public class Mudkip extends Pokemon implements Rock, Water {

	public Mudkip(String name, int pokedexID) {
		super(name, pokedexID);
	}

	@Override
	public void rockSmash() {
		
	}

	@Override
	public void earthQuake() {
		
	}
	
	@Override
	public void waterGun(){
		
	}
	
	@Override
	public void surf(){
		
	}

}
