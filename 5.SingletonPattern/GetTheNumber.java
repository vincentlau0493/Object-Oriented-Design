public class GetTheNumber implements Runnable {

	private Singleton numGenerator;
	private int range;
	public GetTheNumber(int range) {
		this.range = range;
	}

	public void run() {
		numGenerator = Singleton.getInstance(range);
		System.out.println("Instance ID: " + System.identityHashCode(numGenerator));
		System.out.println("Player: " + numGenerator.getNumber());
		System.out.println("Remain: " + numGenerator.getNumberList());
		System.out.println("----------------------");
	}


}