package entity.test;

import static org.junit.jupiter.api.Assertions.*;

import entity.Entity;
import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

class EntityTest {

	Entity entity;

	@BeforeEach
	void setup() {
		entity = new Entity(0, 0, 1, 1, Color.BLACK);
	}

	@Test
	void testEntity() {
		try {
			new Entity(0, 0, 1, 1, Color.BLACK);
		}
		catch (Exception e) {
			fail();
		}
	}

	@Test
	void testGetColor() {
		assertTrue(entity.getColor() == Color.BLACK);
	}

	@Test
	void testGetPositionX() {
		assertTrue(entity.getPositionX() == 0);
	}

	@Test
	void testGetPositionY() {
		assertTrue(entity.getPositionY() == 0);
	}

	@Test
	void testSetPositionX() {
		entity.setPositionX(1);
		assertTrue(entity.getPositionX() == 1);
	}

	@Test
	void testSetPositionY() {
		entity.setPositionY(1);
		assertTrue(entity.getPositionY() == 1);
	}

	@Ignore
	void testGetSpriteType() {

	}

	@Test
	void testGetWidth() {
		assertTrue(entity.getWidth() == 1);
	}

	@Test
	void testGetHeight() {
		assertTrue(entity.getHeight() == 1);
	}

}
