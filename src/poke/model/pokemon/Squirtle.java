package poke.model.pokemon;

import java.awt.Color;

import poke.model.Pokemon;
import poke.model.types.Water;

public class Squirtle extends Pokemon implements Water{

	public Squirtle(String nickName) {
		super("Squirtle", nickName, 599);
		super.setDefensePoints(80);
		super.setHealthPoints(400);
		super.setBackgroundColor(Color.blue);
	}
	
	@Override
	public String getAttackString() {
		return super.getAttackString();
	}

	@Override
	public int waterGun() {
		return 10;
	}

	@Override
	public int surf() {
		return 20;
	}

}