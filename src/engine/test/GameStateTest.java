package engine.test;

import static org.junit.jupiter.api.Assertions.*;

import engine.GameState;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameStateTest {

	GameState gameState;

	@BeforeEach
	void setup() {
		gameState = new GameState(1, 100, 1, 1, 1, 200, 1, 2, 2, 4);
	}

	@Test
	void testGameState() {
		try {
			new GameState(1, 100, 1, 1, 1, 200, 1, 2, 2, 4);
		}
		catch (Exception e) {
			fail();
		}
	}

	@Test
	void testGetLevel() {
		assertTrue(gameState.getLevel() == 1);
	}

	@Test
	void testGetScoreP1() {
		assertTrue(gameState.getScoreP1()== 100);
	}

	@Test
	void testGetLivesRemainingP1() {
		assertTrue(gameState.getLivesRemainingP1() == 1);
	}

	@Test
	void testGetBulletsShotP1() {
		assertTrue(gameState.getBulletsShotP1() == 1);
	}

	@Test
	void testGetShipsDestroyedP1() {
		assertTrue(gameState.getShipsDestroyedP1() == 1);
	}

	@Test
	void testGetScoreP2() {
		assertTrue(gameState.getScoreP2()== 200);
	}

	@Test
	void testGetLivesRemainingP2() {
		assertTrue(gameState.getLivesRemainingP2() == 1);
	}

	@Test
	void testGetBulletsShotP2() {
		assertTrue(gameState.getBulletsShotP2() == 2);
	}

	@Test
	void testGetShipsDestroyedP2() {
		assertTrue(gameState.getShipsDestroyedP2() == 2);
	}

	@Test
	void testGetDifficulty() {
		assertTrue(gameState.getDifficulty() == 4);
	}

}
