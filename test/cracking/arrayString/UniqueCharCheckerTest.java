package cracking.arrayString;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueCharCheckerTest {

	private String testCaseT = "12345";
	private String testCaseT1 = "sadfjk;l12345";
	private String testCaseF = "123455";
	private String testCaseF1 = "!@#$@#$%#$^";
	private String testCaseF2 = "¹þ¹þ";
	
	
	@Test
	public void testIsUniqueChar() {
		assertEquals(true, (new UniqueCharChecker(testCaseT)).isUniqueChar());

	}
	
	@Test
	public void testIsUniqueChar2() {
		assertEquals(false, (new UniqueCharChecker(testCaseF)).isUniqueChar());
	}
	@Test
	public void testIsUniqueChar3() {
		assertEquals(false, (new UniqueCharChecker(testCaseF1)).isUniqueChar());
	}
	@Test
	public void testIsUniqueChar4() {
		assertEquals(false, (new UniqueCharChecker(testCaseF2)).isUniqueChar());
	}
	@Test
	public void testIsUniqueChar5() {
		assertEquals(true, (new UniqueCharChecker(testCaseT1)).isUniqueChar());
	}

}
