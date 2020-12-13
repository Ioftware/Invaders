package screen.test;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import engine.Core;
import engine.GameState;
import screen.ScoreScreen;

class ScoreScreenTest {
	ScoreScreen screen;
	@Ignore
	void testRun() {
		fail("Not yet implemented");
	}

	@Ignore
	void testUpdate() {
		fail("Not yet implemented");
	}

	@Test @BeforeEach
	void testScoreScreen() {
		try {
			screen = new ScoreScreen(5, 6, 60, new GameState(0, 0, 1, 1, 1, 0, 1, 1, 1, Core.NORMAL), false);
		} catch (Exception e) {
			fail();
		}
	}

}
