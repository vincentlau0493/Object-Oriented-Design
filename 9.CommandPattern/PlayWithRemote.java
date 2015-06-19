public class PlayWithRemote {


	public static void main (String[] args) {


		ElectricDevice theTV = new Television();
		Command onCommand = new TurnTVOn(theTV);
		DeviceButton onBtn = new DeviceButton(onCommand);

		onBtn.press();

	}

}