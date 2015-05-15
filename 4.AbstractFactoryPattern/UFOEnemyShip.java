public class UFOEnemyShip extends EnemyShip {

	EnemyShipFactory factory;

	public UFOEnemyShip(EnemyShipFactory factory) {
		this.factory = factory;
	}

	public void makeShip() {
		System.out.println("Making enemy ship " + getName());
		weapon = factory.addWeapon();
		engine = factory.addEngine();
	}

}