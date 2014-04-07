package cracking.list;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cracking.util.Node;

public class DeleteNodeTest {

	Node<Integer> list;
	Node<Integer> list2;
	@Before
	public void setUp() throws Exception {
		list = new Node<Integer>(1);
		list.appendToTail(2);
		list.appendToTail(3);
		list.appendToTail(4);
		
		list2 = new Node<Integer>(1);
		list2.appendToTail(2);
		list2.appendToTail(3);
	}
	

	@Test
	public void test() {
		Node<Integer> n = list.next().next();//node 3 
		assertEquals(true,DeleteNode.deleteNode(n));
		int previous = list.next().getData();
		int newN = list.next().next().getData();
		assertEquals(2,previous);
		assertEquals(4,newN);
	}
	
	@Test
	public void test2() {
		Node<Integer> n = list2.next().next();//node 3 
		assertEquals(false,DeleteNode.deleteNode(n));
		assertEquals(false,DeleteNode.deleteNode(n.next()));
	}

}
