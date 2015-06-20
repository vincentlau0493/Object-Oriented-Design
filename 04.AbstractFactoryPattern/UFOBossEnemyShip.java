public class UFOBossEnemyShip extends EnemyShip {

	EnemyShipFactory factory;

	public UFOBossEnemyShip(EnemyShipFactory factory) {
		this.factory = factory;
	}

	public void makeShip() {
		System.out.println("Making enemy ship " + getName());
		weapon = factory.addWeapon();
		engine = factory.addEngine();
	}

}