public class Mozzarella extends Topping {

	public Mozzarella(Pizza p) {
		super(p);
	}

	public String getDescription() {
		return tmpPizza.getDescription() + ", Mozzarella";
	}

	public double getCost() {
		return tmpPizza.getCost() + .50;
	}


}