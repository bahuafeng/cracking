/**
 * 
 */
package cracking.util;

/**
 * @author ba
 *
 */
public class Node<E> {
	private E data;
	private Node<E> next;
	
	
	public Node(E e){
		data = e;
	}
	
	public Node<E> next(){
		return next;
	}
	
	public void setNext(Node<E> n){
		next = n;
	}
	
	public E getData(){
		return data;
	}
	
	public void setData(E e){
		data = e;
	}
	
	public void appendToTail(E e){
		Node<E> node = new Node<E>(e);
		Node<E> tail = this;
		
		while(tail.next != null){
			tail = tail.next;
		}		
		tail.next = node;		
	}
	
	public void appendToTail(Node<E> node){
		Node<E> tail = this;
		
		while(tail.next != null){
			tail = tail.next;
		}		
		tail.next = node;		
	}
	
	public int size(){
		int size = 1;
		Node<E> p = this;
		while(p.next != null){
			size++;
			p = p.next;
		}
		return size;
	}
	
}
