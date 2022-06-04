package TDA;

import java.util.EmptyStackException;

public class StackArray<E> implements TDAStack<E> {
    private Node<E> top;

    //constructor emptyStack
    public StackArray() {
        this.top = null;
    }

    //constructor push top
    public StackArray(E item) {
        push(item);
    }

    //comprueba si la pila esta vacia
	public boolean empty() {
		return this.top == null;
	}

    //mira la parte superior de la pila sin sacarlo de la pila
	public E peek() {
		if(this.top == null)
			new EmptyStackException();
		return this.top.getData();
	}
	
	//elimina el objeto en la aparte superior de la pila y devuelve el objeto como el valor de la funcion 
	public E pop() {
		if(this.top == null)
			new EmptyStackException();
		E item = this.top.getData();
		this.top = this.top.getNext();
		return item;
	}
	
	/**
	 * inserta un elemento a la parte superior de la pila
	 * @param item valor generico que se desea ingrear a la pila
	 * @return el valor que se desea ingresar
	 */
	public E push(E item) {
		if(this.top == null) {
			this.top = new Node<E>(item);
			return item;
		}
		this.top = new Node<E>(item, this.top);
		return item;
	}

	//devuelve la pocicion basada en 1 donde se encuentre el objeto en la pila
	public int search(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//toString method
	
	public String toString() {
		String txt = "";
		for(Node<E> tmp = this.top; tmp != null; tmp = tmp.getNext()) {
			txt += tmp.getData() + " ";
		}
		
		return txt;
	}

}
