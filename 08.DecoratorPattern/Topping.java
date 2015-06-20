abstract class Topping implements Pizza {

	Pizza tmpPizza;

	public Topping(Pizza p) {
		tmpPizza = p;
	}

	public String getDescription() {
		return tmpPizza.getDescription();
	}

	public double getCost() {
		return tmpPizza.getCost();
	}

}