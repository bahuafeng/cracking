package cracking.arrayString;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RotateTest {

	int[][] m1 = {
			{1,2,3},
			{8,9,4},
			{7,6,5}
	};
	
	int[][] m2 = {
			{7,8,1},
			{6,9,2},
			{5,4,3}
	};
	
	int[][] m3 = {
			{1, 2, 3, 4},
			{12,13,14,5},
			{11,16,15,6},
			{10, 9, 8,7}
	};
	
	int[][] m4 = {
			{10,11,12, 1},
			{ 9,16,13, 2},
			{ 8,15,14, 3},
			{ 7, 6, 5, 4}
	};
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testRotate() {
		Rotate.rotate(m1);
		assertEquals(true, Rotate.isEquals(m1, m2));
	}
	
	@Test
	public void testRotate2() {
		Rotate.rotate(m3);
		assertEquals(true, Rotate.isEquals(m3, m4));
	}

}
