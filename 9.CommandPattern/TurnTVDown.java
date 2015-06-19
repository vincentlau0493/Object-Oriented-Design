public class TurnTVDown implements Command {

	ElectricDevice theDevice;

	public TurnTVDown(ElectricDevice newDevice) {
		theDevice = newDevice;
	}

	public void execute() {
		theDevice.volumeDown();
	}


}