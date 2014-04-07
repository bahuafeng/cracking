/**
 * 
 */
package cracking.list;

import cracking.util.Node;

/**
 * @author ba
 *
 */
public class NthToLast {
	
	
	public static Node<Integer> nthToLast(Node<Integer> list, int n){
		
		if(n > list.size()){
			return null;
		}else{

			Node<Integer> last = list;
			for (int i = 0; i < n; i++) {
				last = last.next();
			}
			Node<Integer> nth = list;
			while(last != null){
				nth = nth.next();
				last = last.next();
			}
			return nth;
		}
		
		
	}
}
