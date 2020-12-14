package entity.test;

import static org.junit.jupiter.api.Assertions.*;

import engine.DrawManager;
import entity.EnemyShip;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EnemyShipTest {

	EnemyShip enemyShip;

	@BeforeEach
	void setup() {
		enemyShip = new EnemyShip(0, 0, DrawManager.SpriteType.EnemyShipA1);
	}

	@Test
	void testEnemyShipIntIntSpriteType() {
		try {
			new EnemyShip(0, 0, DrawManager.SpriteType.EnemyShipA1);
			new EnemyShip(0, 0, DrawManager.SpriteType.EnemyShipA2);
			new EnemyShip(0, 0, DrawManager.SpriteType.EnemyShipB1);
			new EnemyShip(0, 0, DrawManager.SpriteType.EnemyShipB2);
			new EnemyShip(0, 0, DrawManager.SpriteType.EnemyShipC1);
			new EnemyShip(0, 0, DrawManager.SpriteType.EnemyShipC2);
			new EnemyShip(0, 0, DrawManager.SpriteType.EnemyShipSpecial);
		}
		catch (Exception e) {
			fail();
		}
	}

	@Test
	void testEnemyShip() {
		try {
			new EnemyShip();
		}
		catch (Exception e) {
			fail();
		}
	}

	@Test
	void testGetPointValue() {
		assertTrue(enemyShip.getPointValue() == 100);
	}

	@Test
	void testMove() {
		enemyShip.move(1,1);
		assertTrue(enemyShip.getPositionX() == 1);
		assertTrue(enemyShip.getPositionY() == 1);
	}

	@Test
	void testUpdate() {
		try {
			enemyShip.update();
		}
		catch (Exception e) {
			fail();
		}
	}

	@Test
	void testDestroy() {
		try {
			enemyShip.destroy();
		}
		catch (Exception e) {
			fail();
		}
	}

	@Test
	void testIsDestroyedAtFirst() {
		assertTrue(!enemyShip.isDestroyed());
	}

	@Test
	void testIsDestroyedAfterDestroy() {
		enemyShip.destroy();
		assertTrue(enemyShip.isDestroyed());
	}

}
