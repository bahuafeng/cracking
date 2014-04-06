package cracking.arrayString;

import static org.junit.Assert.*;

import org.junit.Test;

public class PermutationCheckerTest {

	String t1 = "name";
	String t2 = "mena";
	String t3 = "mana";
	String t4 = "names";
	
	@Test
	public void test() {
		assertEquals(true, PermutationChecker.isPermutation(t1, t2));
	}
	
	
	
	@Test
	public void test2(){
		assertEquals(false, PermutationChecker.isPermutation(t1, t3));
	}
	
	
	@Test
	public void test3() {
		assertEquals(false, PermutationChecker.isPermutation(t1, t4));
	}
	
	
}

