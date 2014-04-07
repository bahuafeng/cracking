package cracking.list;

import static org.junit.Assert.*;
import cracking.util.*;

import org.junit.Before;
import org.junit.Test;

public class NthToLastTest {

	Node<Integer> list;
	@Before
	public void setUp() throws Exception {
		list = new Node<Integer>(1);
		list.appendToTail(2);
		list.appendToTail(3);
		list.appendToTail(4);
	}

	@Test
	public void testNthToLast() {
		int nth = NthToLast.nthToLast(list, 2).getData();
		assertEquals(3,nth);
	}

}
