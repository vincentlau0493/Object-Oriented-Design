public class UniqueNumber {

	public static void main (String[] args) {

		Runnable player1 = new GetTheNumber(10);
		Runnable player2 = new GetTheNumber(10);

		new Thread(player1).start();
		new Thread(player2).start();
	}


}