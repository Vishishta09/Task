package Single_Inheritance;

public class GameDemo {

	public static void main(String[] args) {
		
		Warrior wa = new Warrior();
		wa.setName("Thor");
		wa.setHealth(100);
		wa.setAttackPower(85);
		wa.setWeapon("Hammer");
		
		wa.displayWarriorDetails();
	}

}
