package cracking.list;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cracking.util.Node;

public class AddListTest {
	Node<Integer> l1;
	Node<Integer> l2;
	
	
	@Before
	public void setUp() throws Exception {
		l1 = new Node<>(0);
		l1.appendToTail(1);//10
		l2 = new Node<>(9);
		l2.appendToTail(9);
		l2.appendToTail(9);
		l2.appendToTail(9);//9999
	}
	
	@Test
	public void testAddList() {
		Node<Integer> result = AddList.addList(l2, l1);
		int ge = result.getData();
		int shi = result.next().getData();
		int bai = result.next().next().getData();
		int qian = result.next().next().next().getData();
		int wan = result.next().next().next().next().getData();
		assertEquals(9,ge);
		assertEquals(0,shi);
		assertEquals(0,bai);
		assertEquals(0,qian);
		assertEquals(1,wan);
	}

}
