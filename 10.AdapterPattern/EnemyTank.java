import java.util.Random;

public class EnemyTank implements EnemyAttacker {

	Random generator = new Random();

	public void fireWeapon() {

		int damage = generator.nextInt(10) + 1;
		System.out.println("Tank Does " + damage + " Damage");

	}

	public void driveForward() {
		int far = generator.nextInt(5) + 1;
		System.out.println("Tank Drvies " + far + " Forward");		
	}

}