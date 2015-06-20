public class RobotEngineer {

	private RobotBuilder builder;

	public RobotEngineer(RobotBuilder builder) {
		this.builder = builder;
	}

	public void makeRobot() {

		builder.buildHead();
		builder.buildTail();
		builder.buildArm();
		builder.buildLeg();

	}

	public Robot getRobot() {
		return builder.getRobot();
	}

}