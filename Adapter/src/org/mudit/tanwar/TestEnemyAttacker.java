package org.mudit.tanwar;

public class TestEnemyAttacker {

	public static void main(String[] args){
		EnemyTank rxTank = new EnemyTank();
		EnemyRobot fredTheRobot = new EnemyRobot();
		EnemyAttacker robotAdapter = new EnemyRobotAdapter(fredTheRobot);
		
		System.out.println("The Robot with Adapter");
		robotAdapter.assignDriver("Mark");
		robotAdapter.driveForward();
		robotAdapter.fireWeapon();
	}
}
