public class Television implements ElectricDevice{

	int volume = 0;

	public void on() {
		System.out.println("TV is On");
	}

	public void off() {
		System.out.println("TV is Off");
	}

	public void volumeUp() {
		System.out.println("TV is Up " + ++volume);
	}

	public void volumeDown() {
		System.out.println("TV is Down " + --volume);
	}

}