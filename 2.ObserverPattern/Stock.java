public class Stock {

	public static void main (String[] args) {

		StockGrabber grabber = new StockGrabber();

		StockObserver user1 = new StockObserver(grabber);
		StockObserver user2 = new StockObserver(grabber);

		grabber.setPrice("ibm", 200.34);
		
		grabber.unregister(user2);

		grabber.setPrice("google", 180.38);
		grabber.setPrice("apple", 250.11);

	}

}