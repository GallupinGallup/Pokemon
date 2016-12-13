package poke.model.pokemon;

import poke.model.Pokemon;
import poke.model.types.Rock;

public class Geodude extends Pokemon implements Rock {

	public Geodude(String name, int pokedexID) {
		super(name, pokedexID);
	}

	@Override
	public void rockSmash() {
		
	}

	@Override
	public void earthQuake() {
		
	}

}
