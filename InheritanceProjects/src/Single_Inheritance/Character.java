package Single_Inheritance;

public class Character {
	private String name;
	private int health;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public void displayCharacterDetails() {
		System.out.println(name + " " + health);
	}

}
class Warrior extends Character {
	private int attackPower;
	private String weapon;
	
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	public void displayWarriorDetails() {
		System.out.println(attackPower +" "+ weapon);
		
		displayCharacterDetails();
	}
	
}
