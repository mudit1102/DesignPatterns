package org.mudit.tanwar;

public class EnemyShipTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnemyShipFactory factory = new EnemyShipFactory();
		EnemyShip ship = factory.makeEnemyShip("U");
        ship.displayEnemyShip();
        ship.followHeroShip();
        ship.enemyShipShoots();
	}

}
