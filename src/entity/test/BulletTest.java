package entity.test;

import static org.junit.jupiter.api.Assertions.*;

import entity.Bullet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BulletTest {

	Bullet bullet;

	@BeforeEach
	void setup() {
		bullet = new Bullet(0, 0, 20);
	}

	@Test
	void testBullet() {
		try {
			new Bullet(0, 0, 20);
		}
		catch (Exception e) {
			fail();
		}
	}

	@Test
	void testSetSprite() {
		try {
			bullet.setSprite();
		}
		catch (Exception e) {
			fail();
		}
	}

	@Test
	void testUpdate() {
		bullet.update();
		assertTrue(bullet.getPositionY() > 0);
	}

	@Test
	void testSetSpeed() {
		bullet.setSpeed(10);
		bullet.update();
		assertTrue(bullet.getPositionY() == 10);
	}

	@Test
	void testGetSpeed() {
		bullet.update();
		assertTrue(bullet.getPositionY() == bullet.getSpeed());
	}

}
