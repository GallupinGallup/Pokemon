package poke.model;

public class Pokemon {
	
	private String name;
	private int pokedexID;
	
	private int healthPoints;
	private int attackPoints;
	private int defensePoints;
	
	public Pokemon(String name, int pokedexID){
		this.name = name;
		this.pokedexID = pokedexID;
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public int getAttackPoints() {
		return attackPoints;
	}

	public void setAttackPoints(int attackPoints) {
		this.attackPoints = attackPoints;
	}

	public int getDefensePoints() {
		return defensePoints;
	}

	public void setDefensePoints(int defensePoints) {
		this.defensePoints = defensePoints;
	}

	public String getName() {
		return name;
	}

	public int getPokedexID() {
		return pokedexID;
	}
}
