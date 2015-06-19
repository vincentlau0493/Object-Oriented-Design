public class TurnTVUp implements Command {

	ElectricDevice theDevice;

	public TurnTVUp(ElectricDevice newDevice) {
		theDevice = newDevice;
	}

	public void execute() {
		theDevice.volumeUp();
	}


}