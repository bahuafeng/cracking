/**
 * 
 */
package cracking.list;

import cracking.util.Node;

/**
 * @author ba
 *
 */
public class AddList {
	public static Node<Integer> addList(Node<Integer> list1, Node<Integer> list2){
		if(list1 == null || list2 == null){
			if(list1 == null && list2 == null){
				return null;
			}else{
				if(list1 == null){
					return list2;
				}else{
					return list1;
				}
			}
		}else{
			
			Node<Integer> result = null;
			int carry = 0, num;
			while(list1 != null && list2 != null){
				int number = list1.getData() + list2.getData() + carry;
				num = number % 10;
				carry = number / 10;
				if(result == null){
					result = new Node<Integer>(num);
				}else{
					result.appendToTail(num);
				}
				
				list1 = list1.next();
				list2 = list2.next();
			}
			
			while(list1 != null){
				int number = list1.getData() + carry;
				num = number % 10;
				carry = number / 10;
				result.appendToTail(num);
				list1 = list1.next();
			}
			
			while(list2 != null){
				int number = list2.getData() + carry;
				num = number % 10;
				carry = number / 10;
				result.appendToTail(list2.getData());
				list2 = list2.next();
			}
			
			if(carry != 0){
				result.appendToTail(carry);
			}
			
			return result;
			
		}
	}
}
