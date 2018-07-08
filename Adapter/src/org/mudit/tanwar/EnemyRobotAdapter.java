package org.mudit.tanwar;

public class EnemyRobotAdapter implements EnemyAttacker{

	EnemyRobot theRobot;
	public  EnemyRobotAdapter(EnemyRobot robot){
		theRobot = robot;
	}
	@Override
	public void fireWeapon() {
		// TODO Auto-generated method stub
		theRobot.smashWithHands();
	}

	@Override
	public void driveForward() {
		// TODO Auto-generated method stub
		theRobot.walkForward();
	}

	@Override
	public void assignDriver(String name) {
		// TODO Auto-generated method stub
		theRobot.reactToHumans(name);
	}

}
