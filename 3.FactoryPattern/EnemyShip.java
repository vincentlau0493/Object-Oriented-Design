public abstract class EnemyShip {

	private String name;
	private double amtDamage;

	public EnemyShip(String n, double d) {
		name = n;
		amtDamage = d;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public void setDamage(double d) {
		amtDamage = d;
	}

	public double getDamage() {
		return amtDamage;
	}

	public void displayShip() {
		System.out.println(getName() + " Enemy Ship on the screen");
	}

	public void shipShoot() {
		System.out.println(getName() + " Enemy Ship attacks and does " + getDamage());
	}

}