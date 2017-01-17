
package poke.model.pokemon;

import java.awt.Color;

import poke.model.Pokemon;
import poke.model.types.Rock;

public class Geodude extends Pokemon implements Rock{

	public Geodude(String nickName) {
		super("Geodude", nickName, 599);
		super.setDefensePoints(80);
		super.setHealthPoints(400);
		super.setBackgroundColor(Color.LIGHT_GRAY);
	}

	@Override
	public int rockSmash() {
		return 553636;
	}

	@Override
	public int earthQuake() {
		return 3544;
	}

}
