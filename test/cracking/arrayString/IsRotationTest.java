package cracking.arrayString;

import static org.junit.Assert.*;

import org.junit.Test;

public class IsRotationTest {

	String s1 = "takeminite";
	String s2 = "minitetake";
	@Test
	public void testIsRotation() {
		assertEquals(true, IsRotation.isRotation(s1, s2));
	}

}
