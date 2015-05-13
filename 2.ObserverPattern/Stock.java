public class Stock {

	public static void main (String[] args) {

		StockGrabber grabber = new StockGrabber();

		StockObserver user1 = new StockObserver(grabber);
		StockObserver user2 = new StockObserver(grabber);

		grabber.unregister(user2);
		// grabber.setPrice("ibm", 200.34);
		// grabber.setPrice("google", 180.38);
		// grabber.setPrice("apple", 250.11);

		Runnable getIBM = new StockGenerator(grabber, 200.34, "IBM");
		Runnable getGOOGLE = new StockGenerator(grabber, 180.38, "GOOGLE");
		Runnable getAPPLE = new StockGenerator(grabber, 250.11, "APPLE");

		new Thread(getIBM).start();
		new Thread(getGOOGLE).start();
		new Thread(getAPPLE).start();

	}

}