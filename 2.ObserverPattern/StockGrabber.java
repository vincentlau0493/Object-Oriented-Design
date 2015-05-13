import java.util.*;

public class StockGrabber implements Subject {

	List<Observer> observers = null;
	public double ibmPrice;
	public double googlePrice;
	public double applePrice;

	public StockGrabber() {
		observers = new ArrayList<Observer>();
	}

	public StockGrabber(double ibm, double google, double apple) {
		ibmPrice = ibm;
		googlePrice = google;
		applePrice = apple;
		observers = new ArrayList<Observer>();
	}

	public void register(Observer o) {
		observers.add(o);
	}

	public void unregister(Observer o) {
		int idx = observers.indexOf(o);
		System.out.println("- User " + (idx + 1) + " unsubscribe");
		observers.remove(o);
	}

	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(this);
		}
	}

	public void setPrice(String company, double price) {
		switch(company) {
			case "ibm":
				ibmPrice = price;
				break;
			case "google":
				googlePrice = price;
				break;
			case "apple":
				applePrice = price;
				break;
		}

		notifyObservers();
	}

	public double getPrice(String company) {
		double price = 0;
		switch(company) {
			case "ibm":
				price = ibmPrice;
				break;
			case "google":
				price = googlePrice;
				break;
			case "apple":
				price = applePrice;
				break;
		}
		return price;
	}
}





