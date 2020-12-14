package screen.test;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import screen.HighScoreScreen;

class HighScoreScreenTest {
	HighScoreScreen screen;
	@Ignore
	void testRun() {
		fail("Not yet implemented");
	}

	@Ignore
	void testUpdate() {
		fail("Not yet implemented");
	}

	@Test @BeforeEach
	void testHighScoreScreen() {
		try {
			screen = new HighScoreScreen(8, 9, 60);
		} catch (Exception e) {
			fail();
		}
	}

}
