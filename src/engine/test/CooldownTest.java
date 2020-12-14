package engine.test;

import static org.junit.jupiter.api.Assertions.*;

import engine.Cooldown;
import engine.Core;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CooldownTest {

	Cooldown cooldown;

	@BeforeEach
	void setup() {
		cooldown = Core.getCooldown(10);
	}

	@Test
	void testCheckFinished() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		assertTrue(cooldown.checkFinished());
	}

	@Test
	void testReset() {
		cooldown.reset();
		assertTrue(!cooldown.checkFinished());
	}

}
