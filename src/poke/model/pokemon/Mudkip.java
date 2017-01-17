
package poke.model.pokemon;

import java.awt.Color;

import poke.model.Pokemon;
import poke.model.types.Rock;
import poke.model.types.Water;

public class Mudkip extends Pokemon implements Rock, Water{

	public Mudkip(String nickName) {
		super("Mudkip", nickName, 599);
		super.setDefensePoints(80);
		super.setHealthPoints(400);
		super.setBackgroundColor(Color.LIGHT_GRAY);
	}

	@Override
	public int rockSmash() {
		return 654694;
	}

	@Override
	public int earthQuake() {
		return 576476756;
	}
	
	@Override
	public int waterGun(){
		return 7567567;
	}
	
	@Override
	public int surf(){
		return 75675367;
	}

}
