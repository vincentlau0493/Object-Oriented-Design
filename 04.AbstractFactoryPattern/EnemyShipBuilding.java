public abstract class EnemyShipBuilding {

	protected abstract EnemyShip makeEnemyShip(String type);

	public EnemyShip orderTheShip(String type) {

		EnemyShip enemy = makeEnemyShip(type);
		enemy.makeShip();
		return enemy;

	}

}