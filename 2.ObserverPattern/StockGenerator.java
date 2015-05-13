import java.util.*;
import java.text.DecimalFormat;

public class StockGenerator implements Runnable{

	private double price;
	private String stock;
	private Subject grabber;

	public StockGenerator(Subject g, double p, String s) {
		price = p;
		grabber = g;
		stock = s;
	}

	public void run() {

		for (int i=0; i<20; i++) {

			try {
				Thread.sleep(1000);

				DecimalFormat df = new DecimalFormat("#.##");
				double ranNum = Math.random() * 0.06 - 0.03; //generate both + and -


				price = Double.valueOf(df.format(price + ranNum));

				((StockGrabber)grabber).setPrice(stock.toLowerCase(), price);
				System.out.println(stock + ": " + price + " " + df.format(ranNum));	
				System.out.println();			
			} catch(InterruptedException e) {};



		}

	}

}