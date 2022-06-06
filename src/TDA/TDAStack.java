package TDA;
public interface TDAStack<E> {
	/**
	 * Comprueba si la pila esta vacia
	 * @return True si esta vacia
	 * @return False si esta con algun objeto
	 */
	boolean empty();
    /**
     * Mira la parte superior de la pila sin sacarlo de la pila
     * @return el objeto top en la cima de la pila 
     * @throws EmptyStackException si la pila esta vacia
     */
    E peek();
    /**
     * Elimina el objeto en la aparte superior de la pila y devuelve el objeto como el valor de la funcion
     * @return El objeto al tope de la lista
     * @throws EmptyStackException si el TDAStack esta vacio  
     */
    E pop();
	/**
	 * Inserta un elemento a la parte superior de la pila
	 * @param item valor generico que se desea ingrear a la pila
	 * @return item el valor que se desea ingresar
	 */
    E push(E item);
    /**
     * Devuelve la pocicion basada en 1 donde se encuentre el objeto en la pila
     * @param o el objeto deseado
     * @return la pocicion basada en 1 si retorna -1 el objeto no esta en la pila
     */
    int search(Object o);
}
