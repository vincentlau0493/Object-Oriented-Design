public class TestBuilder {

	public static void main(String[] args) {

		RobotBuilder builder = new OldRobotBuilder();
		RobotEngineer engineer = new RobotEngineer(builder);

		engineer.makeRobot();
		Robot chapi = engineer.getRobot();
		System.out.println("Robot Completed");

		System.out.println("Robot Head: " + chapi.getHead());
		System.out.println("Robot Tail: " + chapi.getTail());
		System.out.println("Robot Arm: " + chapi.getArm());
		System.out.println("Robot Leg: " + chapi.getLeg());

	}


}