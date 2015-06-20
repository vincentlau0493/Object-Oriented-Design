import java.util.Random;

public class EnemyRobot {

	Random generator = new Random();

	public void smashWithHand() {

		int damage = generator.nextInt(5) + 1;
		System.out.println("Robot Does " + damage + " Damage");

	}

	public void walkForward() {
		int far = generator.nextInt(2) + 1;
		System.out.println("Robot Walks " + far + " Forward");		
	}


}