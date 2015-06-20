public class Bird extends Animal {

	public Bird(String name) {
		super();
		this.name = name;
		// setFly(new ItFly());
		flyType = new ItFly();
	}

}