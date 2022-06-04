package TDA;

import java.util.NoSuchElementException;

public class QueueLink<E> implements TDAQueue<E>{
	private Node<E> head;
	private Node<E> tail;

	/** 
	 * Constructors
	 *
	 */ 
	public QueueLink() {
		this.head = null;
		this.tail = null;
	}
	public QueueLink(Node<E> head) {
		this.head = head;
		this.tail = head;
	}

	public boolean add(E e) {
		return offer(e);
	}

	public E element() {
		if(head == null)
			new NoSuchElementException();
		return head.getData();
	}


	public boolean offer(E e) {
		if(e == null)
			new NullPointerException();

		this.tail = new Node<E>(tail.getData(), new Node<E>(e));
	 	return true;
	}

	public E peek() {
		return this.head.getData();
	}

	public E poll() {
		if(head == null)
			return null;
		E item = this.head.getData();
		this.head = this.head.getNext();
		return item;
	}

	public E remove() {
		if(head == null)
			new NoSuchElementException();
		return poll();
	}

	/**
	 * Este metodo imprime todos los elementos de la cola
	 * @return txt la lista de elementos
	 */

	public String toString() {
		String txt = "";
		for(Node<E> tmp = this.head; tmp != null; tmp = tmp.getNext()) {
			txt += tmp.getData() + " ";
		}
		return txt;
	}

}
