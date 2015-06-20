public class TestAttacker {

	public static void main(String[] args) {

		EnemyAttacker tank = new EnemyTank();
		EnemyRobot fake = new EnemyRobot();
		EnemyAttacker robot = new EnemyRobotAdapter(fake);


		System.out.println("---  Tank Attack  ---");
		tank.fireWeapon();
		tank.driveForward();

		System.out.println("---  Robot Attack  ---");
		robot.fireWeapon();
		robot.driveForward();

	}


}