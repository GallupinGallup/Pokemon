
package poke.model;

import java.awt.Color;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class Pokemon {
	
	private String name;
	private int pokedexID;
	
	private String nickName;
	private int healthPoints;
	private int defensePoints;
	private Color backgroundColor;
	
	public Pokemon(String name, String nickName, int pokedexID){
		this.name = name;
		this.pokedexID = pokedexID;
		this.nickName = nickName;
	}

	public String getAttackString() {
		String attackString = "";
		for(Class<?> interfacez : getClass().getInterfaces()){
			for(Method method : interfacez.getMethods()){
				attackString += "The method "+ method.getName() + " does ";
				try{
					Method attackMethod = getClass().getMethod(method.getName());
					int attackNum = (int) attackMethod.invoke(this);
					attackString += attackNum + " attack damage.\n";
				}catch(IllegalArgumentException | NoSuchMethodException | SecurityException | IllegalAccessException | InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
		return attackString;
	}	
	
	public String toString(){
		return "Name: " + this.name + ", ID: " + this.pokedexID + ", Health: " + this.healthPoints
				+ ", NickName: " + this.nickName + ", Defense: " + this.defensePoints;
	}
	
	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
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

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Color getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
}