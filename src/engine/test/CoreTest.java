package engine.test;

import static org.junit.jupiter.api.Assertions.*;

import engine.*;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

class CoreTest {

	@Ignore
	void testMain() {
		fail("Not yet implemented");
	}

	@Test
	void testGetLogger() {
		assertTrue(Core.getLogger() instanceof Logger);
	}

	@Test
	void testGetDrawManager() {
		assertTrue(Core.getDrawManager() instanceof DrawManager);
	}

	@Test
	void testGetInputManager() {
		assertTrue(Core.getInputManager() instanceof InputManager);
	}

	@Test
	void testGetFileManager() {
		assertTrue(Core.getFileManager() instanceof FileManager);
	}

	@Test
	void testGetCooldown() {
		assertTrue(Core.getCooldown(1) instanceof Cooldown);
	}

	@Test
	void testGetVariableCooldown() {
		assertTrue(Core.getVariableCooldown(1, 1) instanceof Cooldown);
	}

}
