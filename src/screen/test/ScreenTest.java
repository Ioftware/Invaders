package screen.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import screen.Screen;

class ScreenTest {
	
	Screen screen;
	
	@BeforeEach @Test
	void testScreen() {
		try {
			screen = new Screen(1, 2, 60);
		} catch (Exception e) {
			fail();
		}
	}

	@Test
	void testInitialize() {
		try {
			screen.initialize();
		} catch (Exception e) {
			fail();
		}
	}

	@Test
	void testRun() {
		try {
			screen.run_test();
		} catch (Exception e) {
			fail();
		}
	}

	@Test
	void testUpdate() {
		try {
			screen.update_test();
		} catch (Exception e) {
			fail();
		}
	}

	@Test
	void testGetWidth() {
		assertEquals(screen.getWidth(), 1);
	}

	@Test
	void testGetHeight() {
		assertEquals(screen.getHeight(), 2);
	}

}
