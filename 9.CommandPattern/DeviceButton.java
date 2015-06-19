public class DeviceButton {

	Command theCommand;

	public DeviceButton(Command command) {
		theCommand = command;
	}

	public void press() {
		theCommand.execute();
	}

}