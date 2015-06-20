public class EnemyRobotAdapter implements EnemyAttacker {

	EnemyRobot theRobot;

	public EnemyRobotAdapter(EnemyRobot newRobot) {
		theRobot = newRobot;
	}

	public void fireWeapon() {
		theRobot.smashWithHand();
	}

	public void driveForward() {
		theRobot.walkForward();
	}


}