package org.mudit.tanwar;

import java.util.Random;

public class EnemyRobot {

	Random generator = new Random();
	
	public void smashWithHands(){
		int attackDamage = generator.nextInt(10) + 1;
		System.out.println("Enemy Robot Causes " + attackDamage + " Damage with its hands");
	}
	
	public void walkForward(){
		int movement = generator.nextInt(5) + 1;
		System.out.println("Enemy Robot walks forward " + movement + " spaces");
	}
	
	public void reactToHumans(String driverName){
		System.out.println("Enemy Robot Tramps on " + driverName);
	}
}
