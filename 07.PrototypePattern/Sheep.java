public class Sheep implements Prototype {

	public Prototype makeCopy() {
		System.out.println("Sheep is Being Made");

		Sheep sheepObject = null;
		sheepObject = new Sheep(); // clone properties


		return sheepObject;
	}

	public String toString() {
		return "sheep sheep sheep~";
	}

}