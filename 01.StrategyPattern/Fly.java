public interface Fly {

	public String fly();

}


class ItFly implements Fly {

	public String fly() {
		return "It can fly!";
	}

}

class CantFly implements Fly {
	public String fly() {
		return "It can't fly...";
	}
}