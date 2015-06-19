public class TurnTVOn implements Command {

	ElectricDevice theDevice;

	public TurnTVOn(ElectricDevice newDevice) {
		theDevice = newDevice;
	}

	public void execute() {
		theDevice.on();
	}


}