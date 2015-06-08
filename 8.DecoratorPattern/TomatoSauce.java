public class TomatoSauce extends Topping {
	public TomatoSauce(Pizza p) {
		super(p);
	}

	public String getDescription() {
		return tmpPizza.getDescription() + ", tomato sauce";
	}

	public double getCost() {
		return tmpPizza.getCost() + .35;
	}
}