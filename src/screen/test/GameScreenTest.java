package screen.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import engine.Core;
import engine.GameSettings;
import engine.GameState;
import screen.GameScreen;

class GameScreenTest {
	GameScreen screen;
	@Ignore
	void testInitialize() {
		fail("Not yet implemented");
	}

	@Ignore
	void testRun() {
		fail("Not yet implemented");
	}

	@Ignore
	void testUpdate() {
		fail("Not yet implemented");
	}

	@Test @BeforeEach
	void testGameScreen() {
		try {
			screen = new GameScreen(new GameState(0, 0, 1, 1, 1, 0, 1, 1, 1, Core.NORMAL), new GameSettings(5, 4, 60, 2000), false, 8, 9, 60);
		} catch (Exception e) {
			fail();
		}
	}


	@Test
	void testGetGameState() {
		assertEquals(screen.getGameState(), new GameState(0, 0, 1, 1, 1, 0, 1, 1, 1, Core.NORMAL));
	}

}
