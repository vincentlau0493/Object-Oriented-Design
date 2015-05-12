public abstract class Animal {

	String name;
	Fly flyType;

	public Animal() {

	}

	public void setFly (Fly f) {
		flyType = f;
	}

	public void setName (String n) {
		name = n;
	}

	public String toString() {
		return name;
	}

	public String tryToFly() {
		return flyType.fly();
	}

}