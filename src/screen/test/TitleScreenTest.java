package screen.test;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import screen.TitleScreen;

class TitleScreenTest {
	TitleScreen screen;
	@Test @BeforeEach
	void testTitleScreen() {
		try {
			screen = new TitleScreen(3, 4, 60);
		} catch (Exception e) {
			fail();
		}
	}

	@Ignore
	void testRun() {
		fail("Not yet implemented");
	}

	@Ignore
	void testUpdate() {
		fail("Not yet implemented");
	}

}
