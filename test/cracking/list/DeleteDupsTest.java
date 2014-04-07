package cracking.list;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cracking.util.Node;

public class DeleteDupsTest {

	Node<Integer> l1; 
	Node<Integer> l2;
	
	@Before
	public void setUp() throws Exception {
		l1 = new Node(1);
		l1.appendToTail(2);
		l1.appendToTail(1);
	}
	
	@Test
	public void test() {
		DeleteDups.deleteDups(l1);
		assertEquals(2, l1.size());
	}

}
