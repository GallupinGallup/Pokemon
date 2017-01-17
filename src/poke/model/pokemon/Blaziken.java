
package poke.model.pokemon;

import java.awt.Color;

import poke.model.Pokemon;
import poke.model.types.Fire;

public class Blaziken extends Pokemon implements Fire{

	public Blaziken(String nickName) {
		super("Blaziken", nickName, 599);
		super.setDefensePoints(80);
		super.setHealthPoints(400);
		super.setBackgroundColor(Color.LIGHT_GRAY);
	}

	@Override
	public int ember() {
		return 564;
	}

	@Override
	public int flameThrower() {
		return 3573;
	}

}