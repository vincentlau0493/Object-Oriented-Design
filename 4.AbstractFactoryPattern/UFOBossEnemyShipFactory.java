public class UFOBossEnemyShipFactory implements EnemyShipFactory {

	public ESWeapon addWeapon() {
		return new AK47Weapon();
	}
	public ESEngine addEngine() {
		return new V8Engine();
	}


}