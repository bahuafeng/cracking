/**
 * 
 */
package util;

/**
 * @author ba
 *
 */

public class HashTable<E> {
	final int n = 100;
	E[] array = (E[]) new Object[n];
	
//	public boolean put(E key){
//		
//	}
	//TODO have not done yet!!
	
	public int hash(E key){
		return key.hashCode() % array.length;
	}
}
