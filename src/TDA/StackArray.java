package TDA;

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
		return this.top.getData();
	}

	//elimina el objeto en la aparte superior de la pila y devuelve el objeto como el valor de la funcion 
	public E pop() {
		
		return null;
	}

	//inserta un elemento a la parte superior de la pila
	public E push(E item) {
		// TODO Auto-generated method stub
		return null;
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
			txt += tmp.getData();
		}
		
		return txt;
	}

}
