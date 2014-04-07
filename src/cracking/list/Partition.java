/**
 * 
 */
package cracking.list;

import cracking.util.Node;

/**
 * @author ba
 *
 */
public class Partition {
	public static Node<Integer> partition(Node<Integer> list, int x){
		Node<Integer> smaller=null,gequal=null;
		while(list != null){
			if(list.getData() < x){
				if(smaller == null){
					smaller = new Node<Integer>(list.getData());
				}else{
					smaller.appendToTail(list.getData());
				}
			}else{
				if(gequal == null){
					gequal = new Node<Integer>(list.getData());
				}else{
					gequal.appendToTail(list.getData());
				}
			}
			list = list.next();
		}
		
		if(smaller != null){
			smaller.appendToTail(gequal);
			return smaller;
		}else{
			return gequal;
		}
	}
}
