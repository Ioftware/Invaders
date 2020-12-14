package entity.test;

import static org.junit.jupiter.api.Assertions.*;

import engine.GameSettings;
import engine.GameState;
import entity.Bullet;
import entity.EnemyShip;
import entity.EnemyShipFormation;
import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import screen.Screen;

import java.util.*;

class EnemyShipFormationTest {

	EnemyShipFormation enemyShipFormation;

	@BeforeEach
	void setup() {
		GameSettings gameSettings = new GameSettings(1, 1, 60, 2000);
		enemyShipFormation = new EnemyShipFormation(gameSettings);
	}

	@Test
	void testEnemyShipFormation() {
		GameSettings gameSettings = new GameSettings(1, 1, 60, 2000);
		try {
			enemyShipFormation = new EnemyShipFormation(gameSettings);
		}
		catch (Exception e) {
			fail();
		}
	}

	@Test
	void testAttach() {
		try {
			Screen screen = new Screen(1, 1, 60);
			enemyShipFormation.attach(screen);
		}
		catch (Exception e) {
			fail();
		}
	}

	@Ignore
	void testDraw() {

	}

	@Test
	void testUpdate() {
		try {
			enemyShipFormation.update();
		}
		catch (Exception e) {
			fail();
		}
	}

	@Ignore
	void testShoot() {

	}

	@Test
	void testDestroy() {
		try {
			Iterator<EnemyShip> iterator = enemyShipFormation.iterator();
			EnemyShip next = iterator.next();
			next.destroy();
			enemyShipFormation.destroy(next);
		}
		catch (Exception e) {
			fail();
		}
	}

	@Test
	void testGetNextShooter() {
		List<EnemyShip> col = new ArrayList<EnemyShip>();
		EnemyShip next = enemyShipFormation.iterator().next();
		col.add(enemyShipFormation.iterator().next());
		assertTrue(next == enemyShipFormation.getNextShooter(col));
	}

	@Test
	void testIterator() {
		Iterator<EnemyShip> iterator = enemyShipFormation.iterator();
		assertTrue(iterator.hasNext());
	}

	@Test
	void testIsEmptyAtFirst() {
		assertTrue(!enemyShipFormation.isEmpty());
	}

	@Test
	void testIsEmptyAfterDestroy() {
		Iterator<EnemyShip> iterator = enemyShipFormation.iterator();
		EnemyShip next = iterator.next();
		next.destroy();
		enemyShipFormation.destroy(next);
		assertTrue(enemyShipFormation.isEmpty());
	}

}
