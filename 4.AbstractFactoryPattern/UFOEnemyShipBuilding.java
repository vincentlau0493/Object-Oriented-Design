public class UFOEnemyShipBuilding extends EnemyShipBuilding {


	protected EnemyShip makeEnemyShip(String type) {

		EnemyShip enemy = null;
		EnemyShipFactory factory = null;
		if (type.equals("UFO")) {

			factory =  new UFOEnemyShipFactory();
			enemy = new UFOEnemyShip(factory);
			enemy.setName("UFO SHIP");

		} else if (type.equals("UFO BOSS")) {

			factory = new UFOBossEnemyShipFactory();
			enemy = new UFOBossEnemyShip(factory);
			enemy.setName("UFO BOSS SHIP");

		}

		return enemy;
	}


}