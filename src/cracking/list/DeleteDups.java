package cracking.list;

import java.util.HashMap;

import cracking.util.Node;

public class DeleteDups {
	public static void deleteDups(Node<Integer> p){
		HashMap<Integer,Boolean> hashTable = new HashMap<Integer,Boolean>();
		
		Node<Integer> previous = null;
		while(p != null){
			int key = p.getData();
			if(!hashTable.containsKey(key)){
				hashTable.put(key, true);
				previous = p;
			}else{
				previous.setNext(p.next());				
			}
			p = p.next();
		}
	}
}
