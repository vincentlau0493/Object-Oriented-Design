import java.util.Scanner;

public class EnemyTesting {

	public static void main (String[] args) {

		Scanner userInput = new Scanner(System.in);
		EnemyShip theEnemy = null;
		EnemyShipFactory enemyFactory = new EnemyShipFactory();

		while (true) {
			System.out.println("What type of ship? (U / R)");

			if (userInput.hasNextLine()) {
				String type = userInput.nextLine();
				theEnemy = enemyFactory.getEnemyShip(type);
			}

			if (theEnemy != null) {
				doEnemyStuff(theEnemy);
				break;
			}			
		}




	}

	public static void doEnemyStuff (EnemyShip enemy) {
		enemy.displayShip();
		enemy.shipShoot();
	}

}