package TDA;

import java.util.NoSuchElementException;

public class QueueArray<E> implements TDAQueue<E> {
    
    private E[] elements;
    private E head;
    private E tail;
    int numElements;
    private final int default_capacity = 10;
    
    /**
     * Constructors
     *
     */
    public QueueArray() {
        this.elements = (E[]) new Object[default_capacity];
        this.head = elements[0];
        this.tail = elements[0];
        this.numElements = 0;
    }
    public QueueArray(E head) {
        this.elements = (E[] ) new Object[default_capacity];
        add(head);
        this.numElements = 1;
    }


	public boolean add(E e) {
        if(elements.length == this.numElements)
        	throw new IllegalStateException();
    
        return offer(e);
	}

	public E element() {
		if(head == null)
            throw new NoSuchElementException();
        
		return peek();
	}

	public boolean offer(E e) {
        if(this.head == null) {
        	elements[0] = e;
        	this.head = elements[0];
        	this.tail = elements[0];
        	return true;
        }
        
		if(e == null)
            throw new NullPointerException();
        
		int length = elements.length - 1;
        if(elements[length] != null)
        	rezize();
        int i = length;
        while(elements[i] == null ) {
        	i--;
        }
        elements[i+1] = e;
        this.tail = elements[i];
        
		return true;
	}
	public void rezize() {
		int length = elements.length;
		E[] e = (E[]) new Object[length*2];
		for (int i = 0; i < length; i++) 
			e[i] = elements[i];
		this.elements = e;
	}

	public E peek() {
    	return this.head;
	}

	public E poll() {
		int i = 0;
        while(elements[i] == null) {
            i++;
        }
        E item = elements[i];
        head = elements[i + 1];
        elements[i] = null;    
		return item;
	}

	public E remove() {
		if(head == null)
            throw new NoSuchElementException();
		return poll();
	}
	
	/**
	 * Imprime la cola
	 */
	public String toString() {
		String txt = "";
		for(int i = 0 ; i < elements.length; i++) {
			if(elements[i] == null) continue;
			txt += elements[i] + " ";
		}
		return txt;
	}
    
}
