public class AnimalPlay {

	public static void main (String[] args) {

		Animal ruby = new Dog("RUBY");
		System.out.println("ruby: " + ruby.tryToFly());

		Animal pretty = new Bird("PRETTY");
		System.out.println("pretty: " + pretty.tryToFly());

	}

}