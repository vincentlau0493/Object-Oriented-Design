public class OldRobotBuilder implements RobotBuilder {

	private Robot robot;

	public OldRobotBuilder() {
		robot = new Robot();
	}

	public void buildHead() {
		robot.setHead("Old Head");
	}

	public void buildTail() {
		robot.setTail("Old Tail");
	}

	public void buildArm() {
		robot.setArm("Old Arm");
	}

	public void buildLeg() {
		robot.setLeg("Old Leg");
	}

	public Robot getRobot() {
		return robot;
	}
}