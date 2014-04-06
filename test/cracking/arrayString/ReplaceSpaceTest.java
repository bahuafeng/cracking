package cracking.arrayString;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReplaceSpaceTest {

	String s1 = " dd dd dd ";
	String s2 = "%20dd%20dd%20dd%20";
	@Test
	public void test() {
		String str = ReplaceSpace.replace(s1);
		System.err.println(str);
		assertEquals(true, s2.equals(str));
	}

}
