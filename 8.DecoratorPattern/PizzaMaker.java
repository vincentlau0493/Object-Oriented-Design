public class PizzaMaker {

	public static void main(String[] args) {

		Pizza pizza = new Mozzarella(new TomatoSauce(new PlainPizza()));

		System.out.println("Description: " + pizza.getDescription());
		System.out.println("Cost: " + pizza.getCost());

	}

}