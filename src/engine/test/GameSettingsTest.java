package engine.test;

import static org.junit.jupiter.api.Assertions.*;

import engine.GameSettings;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameSettingsTest {

	GameSettings gameSettings;

	@BeforeEach
	void setup() {
		gameSettings = new GameSettings(1, 1, 60, 2000);
	}

	@Test
	void testGameSettings() {
		try {
			new GameSettings(1, 1, 60, 2000);
		}
		catch (Exception e) {
			fail();
		}
	}

	@Test
	void testGetFormationWidth() {
		assertTrue(gameSettings.getFormationWidth() == 1);
	}

	@Test
	void testGetFormationHeight() {
		assertTrue(gameSettings.getFormationHeight() == 1);
	}

	@Test
	void testGetBaseSpeed() {
		assertTrue(gameSettings.getBaseSpeed() == 60);
	}

	@Test
	void testGetShootingFrecuency() {
		assertTrue(gameSettings.getShootingFrecuency() == 2000);
	}

}
