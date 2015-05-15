public abstract class EnemyShip {

	private String name;
	protected ESWeapon weapon;
	protected ESEngine engine;

	public abstract void makeShip();

	public String toString() {
		String info = "The " + name + " has a top of speed of " + engine + " and an attack power of " + weapon;
		return info;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

}