package entity.test;

import static org.junit.jupiter.api.Assertions.*;

import entity.Bullet;
import entity.Ship;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

class ShipTest {

	Ship ship;

	@BeforeEach
	void setup() {
		ship = new Ship(0, 0, true);
	}

	@Test
	void testShip() {
		try {
			new Ship(0, 0, true);
		}
		catch (Exception e) {
			fail();
		}
	}

	@Test
	void testMoveRight() {
		ship.moveRight();
		assertTrue(ship.getPositionX() > 0);
	}

	@Test
	void testMoveLeft() {
		ship.moveLeft();
		assertTrue(ship.getPositionX() < 0);
	}

	@Test
	void testShoot() {
		Set<Bullet> bulletSet = new HashSet<Bullet>();
		assertTrue(ship.shoot(bulletSet));
	}

	@Test
	void testDoubleShoot() {
		Set<Bullet> bulletSet = new HashSet<Bullet>();
		assertTrue(ship.shoot(bulletSet));
		assertTrue(!ship.shoot(bulletSet));
	}

	@Test
	void testUpdate() {
		try {
			ship.update();
		}
		catch (Exception e) {
			fail();
		}
	}

	@Test
	void testDestroy() {
		try {
			ship.destroy();
		}
		catch (Exception e) {
			fail();
		}
	}

	@Test
	void testIsDestroyedAtFirst() {
		assertTrue(!ship.isDestroyed());
	}

	@Test
	void testIsDestroyedAfterDestroy() {
		ship.destroy();
		assertTrue(ship.isDestroyed());
	}

	@Test
	void testGetSpeed() {
		ship.moveRight();
		assertTrue(ship.getPositionX() == ship.getSpeed());
		ship.moveLeft();
		assertTrue(ship.getPositionX() == 0);
	}

}
