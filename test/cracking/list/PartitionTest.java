package cracking.list;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cracking.util.Node;

public class PartitionTest {
	Node<Integer> list;
	@Before
	public void setUp() throws Exception {
		list = new Node<Integer>(1);
		list.appendToTail(3);
		list.appendToTail(4);
		list.appendToTail(2);
	}

	@Test
	public void test() {
		Node<Integer> nl = Partition.partition(list, 3);
		int sec = nl.next().getData();
		assertEquals(2,sec);
	}

}
