public class StockObserver implements Observer {

	Subject subject;

	static int observerIdTracker = 0;
	private int observerID = 0;

	public double ibmPrice;
	public double googlePrice;
	public double applePrice;

	public StockObserver(Subject s) {
		observerID = ++observerIdTracker;
		subject = s;

		subject.register(this);
		System.out.println("- User " + observerID + " subscribe");
	}

	public void update(Subject s) {
		if (s instanceof StockGrabber == false) return;

		ibmPrice = ((StockGrabber)s).getPrice("ibm");
		googlePrice = ((StockGrabber)s).getPrice("google");
		applePrice = ((StockGrabber)s).getPrice("apple");

		printPrice();
	}

	public void printPrice() {

		System.out.println("User " + observerID + "\nIBM: "
								 + ibmPrice + "\nGOOGLE: " + googlePrice + "\nAPPLE: " + applePrice + "\n");

	}

}