public class Dog extends Animal {

	public Dog(String name) {
		super();
		this.name = name;
		// setFly(new CantFly());
		flyType = new CantFly();
	}

}