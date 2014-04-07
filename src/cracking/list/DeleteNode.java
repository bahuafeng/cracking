package cracking.list;

import cracking.util.Node;


public class DeleteNode {
	
	/**
	 * n is not the last node in a list.
	 * @param n
	 */
	public static boolean deleteNode(Node<Integer> n){
		if(n == null || n.next() == null){
			return false;
		}
		n.setData(n.next().getData());
		n.setNext(n.next().next());
		return true;
	}
}
