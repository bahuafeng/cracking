/**
 * 
 */
package cracking.arrayString;

import static org.junit.Assert.*;

import org.junit.Test;

import cracking.util.Matrix;

/**
 * @author ba
 *
 */
public class SetZerosTest {

	int[][] m1 = {
			{0,1,2,3},
			{4,5,6,7},
			{8,9,0,1}
	};
	
	int[][] m2 = {
			{0,0,0,0},
			{0,5,0,7},
			{0,0,0,0}
	};
	
	@Test
	public void test() {
		SetZeros.setZeros(m1);
		assertEquals(true,Matrix.isEquals(m1, m2));
	}

}
