public class EnemyShipFactory {

	public EnemyShipFactory () {
	}

	public EnemyShip getEnemyShip (String enemyType) {
		if (enemyType.equals("U")) {
			return new UFOEnemyShip();
		} else if (enemyType.equals("R")) {
			return new RocketEnemyShip();
		} else {
			return null;
		}
	}


}