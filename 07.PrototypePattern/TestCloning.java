public class TestCloning {

	public static void main(String[] args) {

		CloneFactory factory = new CloneFactory();
		Sheep sally = new Sheep();
		Sheep cloneSheep = (Sheep)factory.getClone(sally);

		System.out.println(sally);
		System.out.println(cloneSheep);
		System.out.println("Sally: " + System.identityHashCode(sally));
		System.out.println("Clone Sheep: " + System.identityHashCode(cloneSheep));

	}

}