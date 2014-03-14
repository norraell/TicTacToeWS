package tests;

import static org.junit.Assert.*;
import modell.Spielfeld;

import org.junit.Test;

public class TestSpielfeld {
	
	@Test
	public void testSetzeFeld() {
		Spielfeld spielfeld = new Spielfeld();
		assertTrue(spielfeld.setzeFeld(0, 1));
		assertTrue(spielfeld.setzeFeld(2, 1));
		assertFalse(spielfeld.setzeFeld(-4, 1));
		assertFalse(spielfeld.setzeFeld(1, 4));
		assertTrue(spielfeld.setzeFeld(1,-1));
		assertFalse(spielfeld.setzeFeld(0, 1));
	}

}
