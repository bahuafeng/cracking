package cracking.arrayString;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStrTest {

	String testCase1 = "1234";
	String testCase2 = "4321";
	String testCase3 = "123";
	String testCase4 = "321";
	
	@Test
	public void test() {
		assertEquals(true, testCase1.equals(ReverseStr.reverse(testCase2)));
	}
	
	@Test
	public void test2() {
		assertEquals(true, testCase3.equals(ReverseStr.reverse(testCase4)));
	}

}
