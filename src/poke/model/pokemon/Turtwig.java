
package poke.model.pokemon;

import java.awt.Color;

import poke.model.Pokemon;
import poke.model.types.Grass;

public class Turtwig extends Pokemon implements Grass{

	public Turtwig(String nickName) {
		super("Turtwig", nickName, 599);
		super.setDefensePoints(80);
		super.setHealthPoints(400);
		super.setBackgroundColor(Color.LIGHT_GRAY);
	}

	@Override
	public int absorb() {
		return 30;
	}

	@Override
	public int razerLeaf() {
		return 70;
	}

}