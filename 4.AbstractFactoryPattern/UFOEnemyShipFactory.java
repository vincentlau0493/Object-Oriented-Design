public class UFOEnemyShipFactory implements EnemyShipFactory {

	public ESWeapon addWeapon() {
		return new PistolWeapon();
	}
	public ESEngine addEngine() {
		return new V6Engine();
	}


}