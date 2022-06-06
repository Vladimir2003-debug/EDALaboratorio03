package TDA;

import java.util.EmptyStackException;

public class StackLink<E> implements TDAStack<E> {
    private Node<E> top;

    /**
     * contructor que no tiene parametros
     */
    public StackLink() {
        this.top = null;
    }
    /**
     * constructor que recibe un valor que sera el top de la pila
     @param item el valor inical de la pila
     */
    public StackLink(E item) {
        push(item);
    }

	/**
	 * metodo que retorna el Nodo del top de la pila
	 * @return el valor del top de la pila
	 */
	public Node<E> getTop() {
		return this.top;
	}

	public boolean empty() {
		return this.top == null;
	}

	public E peek() {
		if(this.top == null)
			throw new EmptyStackException();
		return this.top.getData();
	}
	
	public E pop() {
		if(this.top == null)
			throw new EmptyStackException();
		E item = this.top.getData();
		this.top = this.top.getNext();
		return item;
	}
	
	public E push(E item) {
		if(this.top == null) {
			this.top = new Node<E>(item);
			return item;
		}
		this.top = new Node<E>(item, this.top);
		return item;
	}

	public int search(Object o) {
		int i = 1;
		Node<E> tmp = this.top;
		while(tmp != null) {
			if(tmp.getData().equals(o))
				return i;
			tmp = tmp.getNext();
			i++;
		}
		return -1;
	}
		
	public String toString() {
		String txt = "";
		for(Node<E> tmp = this.top; tmp != null; tmp = tmp.getNext()) {
			txt += tmp.getData() + " ";
		}
		
		return txt;
	}

}
