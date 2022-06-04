package TDA;
interface TDAStack<E> {
	/**
	 * comprueba si la pila esta vacia
	 */
	boolean empty();
    /**
     * mira la parte superior de la pila sin sacarlo de la pila
     */
    E peek();
    /**
     * elimina el objeto en la aparte superior de la pila y devuelve el objeto como el valor de la funcion
     * @exception si el TDAStack esta vacio  
     */
    E pop();
	/**
	 * inserta un elemento a la parte superior de la pila
	 * @param item valor generico que se desea ingrear a la pila
	 * @return item el valor que se desea ingresar
	 * @exception si el TDAStack esta vacio
	 */
    E push(E item);
    /**
     * devuelve la pocicion basada en 1 donde se encuentre el objeto en la pila
     * @param o el objeto deseado
     * @return la pocicion basada en 1 si retorna -1 el objeto no esta en la pila
     */
    int search(Object o);
}
