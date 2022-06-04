package TDA;

import java.util.EmptyStackException;

public class StackArray<E> implements TDAStack<E> {
	private E[] elements;
	private E top;
	
	private final int defaultStackSize = 10;
	/**
	 * constructor
	 */
	public StackArray() {
		this.elements = (E[]) new Object[defaultStackSize];
		this.top = elements[0];
	}

	public StackArray(E element) {
		push(element);
	}
	
	public boolean empty() {
		return this.top == null;
	}

	public E peek() {
		if(this.top == null)
			new EmptyStackException();
		return this.top;
	}

	public E pop() {
		if(this.top == null)
			new EmptyStackException();
		E item = this.top;
		return item;
	}

	public E push(E item) {
		if(this.top == null) {
			this.top = item;
			elements[0] = item;
			return item;
		}
		
		int i = elements.length - 1;
		while(elements[i] == null) {
			i--;
		}
		if ((i) == elements.length - 1) {
			rezize();
		}
		elements[i+1] = item;
		this.top = elements[i];
		return item;
	}
	
	/**
	 * Metodo que copia los elementos de un arreglo
	 * a otro de tamaño doble
	 */
	public void rezize() {
		int length = elements.length;
		E[] tmp= (E[]) new Object[ length * 2];
		for (int i = 0; i < length; i++) {
			tmp[i] = elements[i];
		}
		elements = tmp;
	}
	
	public int search(Object o) {
		int i = 0;
		while(elements[i] != null) {
			if(elements[i].equals(o))
				return i;
			i++;
		}
		return -1;
	}
	
	public String toString() {
		String txt = "";
		for (int i = 0; i < elements.length; i++) {
			if(elements[i] == null) continue;
			txt += elements[i] + " "; 
		}
		return txt;
	}

}
