package engine.test;

import static org.junit.jupiter.api.Assertions.*;

import engine.Score;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ScoreTest {

	Score score;

	@BeforeEach
	void setup() {
		score = new Score("PJS", 100);
	}

	@Test
	void testScore() {
		try {
			new Score("PJS", 100);
		}
		catch (Exception e) {
			fail();
		}
	}

	@Test
	void testGetName() {
		assertTrue(score.getName() == "PJS");
	}

	@Test
	void testGetScore() {
		assertTrue(score.getScore() == 100);
	}

	@Test
	void testCompareTo() {
		Score score_compare = new Score("HHW", 101);
		assertTrue(score.compareTo(score_compare) == 1);
	}

}
