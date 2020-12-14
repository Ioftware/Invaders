package screen.test;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import engine.Core;
import screen.PreGameScreen;

class PreGameScreenTest {
	PreGameScreen screen;
	@Ignore
	void testRun() {
		fail("Not yet implemented");
	}

	@Ignore
	void testUpdate() {
		fail("Not yet implemented");
	}

	@Test @BeforeEach
	void testPreGameScreen() {
		try {
			screen = new PreGameScreen(7, 8, 60, Core.NORMAL);
		} catch (Exception e) {
			fail();
		}
	}

}
