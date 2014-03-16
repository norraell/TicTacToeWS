package tests;

import static org.junit.Assert.*;
import modell.Baum;

import org.junit.Test;

public class TestBaum {

	@Test
	public void testBaumErstellen() {
		Baum baum = new Baum();
		baum.neuerBaum();
		assertSame(baum.root.ns.get(0).tiefe, (short) 0);
	}

}
