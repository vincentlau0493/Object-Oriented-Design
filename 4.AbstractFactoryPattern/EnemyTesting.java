import java.util.Scanner;

public class EnemyTesting {

	public static void main (String[] args) {

		Scanner userInput = new Scanner(System.in);
		EnemyShip theEnemy = null;
		EnemyShipBuilding building = new UFOEnemyShipBuilding();

		while (true) {
			System.out.println("What type of ship? (UFO / UFO BOSS)");

			if (userInput.hasNextLine()) {
				String type = userInput.nextLine();
				theEnemy = building.orderTheShip(type);
			}

			if (theEnemy != null) {
				System.out.println("Ship: " + theEnemy);
				break;
			}			
		}




	}


}