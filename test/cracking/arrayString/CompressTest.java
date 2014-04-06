/**
 * 
 */
package cracking.arrayString;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author ba
 *
 */
public class CompressTest {

	String tstcs1 = "aabcccccaaa";
	String tstcs2 = "a2b1c5a3";
	
	String tstcs3 = "aabcaaa";
	String tstcs4 = "a2b1c1a3";
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link cracking.arrayString.Compress#compress(java.lang.String)}.
	 */
	@Test
	public void testCompress() {
		assertEquals(true, tstcs2.equals(Compress.compress(tstcs1)));
	}
	
	/**
	 * Test method for {@link cracking.arrayString.Compress#compress(java.lang.String)}.
	 */
	@Test
	public void testCompress1() {
		assertEquals(true, tstcs3.equals(Compress.compress(tstcs3)));
	}

}
