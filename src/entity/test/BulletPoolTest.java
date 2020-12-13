package entity.test;

import static org.junit.jupiter.api.Assertions.*;

import entity.Bullet;
import entity.BulletPool;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

class BulletPoolTest {

	BulletPool bulletPool;

	@Test
	void testGetBullet() {
		try {
			BulletPool.getBullet(0, 0, 20);
		}
		catch (Exception e) {
			fail();
		}
	}

	@Test
	void testRecycle() {
		try {
			Set<Bullet> bulletSet = new HashSet<Bullet>();
			bulletSet.add(BulletPool.getBullet(0, 0, 20));
			BulletPool.recycle(bulletSet);
		}
		catch (Exception e) {
			fail();
		}
	}

}
