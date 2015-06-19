public class TurnTVOff implements Command {

	ElectricDevice theDevice;

	public TurnTVOff(ElectricDevice newDevice) {
		theDevice = newDevice;
	}

	public void execute() {
		theDevice.off();
	}


}