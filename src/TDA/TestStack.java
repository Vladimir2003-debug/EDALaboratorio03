package TDA;

/**
 * Archivo donde se evaluan los metodos de stack
 * @author Sulla Quispe Vladimir Arturo
 *
 */
public class TestStack {

	public static void main(String[] args) {

		//STACKS TEST
		
		StackArray<Integer> stackArray = new StackArray<Integer>();
		StackLink<Integer> stackLink = new StackLink<Integer>();
		System.out.println("STACKARRAY");
		stackArray.empty();
		stackArray.push(12);
		stackArray.push(11);
		stackArray.push(43);
		System.out.println(stackArray);
		System.out.println("Ver top de la pila peek()");
		System.out.println(stackArray.peek());
		System.out.println("Eliminacion top pop()");
		System.out.println(stackArray.pop());
		System.out.println("Busqueda de un elemento search()");
		System.out.println(stackArray.search(11));
		System.out.println();
		
		System.out.println("STACKLINK");
		stackLink.empty();
		stackLink.push(12);
		stackLink.push(11);
		stackLink.push(43);
		System.out.println(stackLink);
		System.out.println("Ver top de la pila peek()");
		System.out.println(stackLink.peek());
		System.out.println("Eliminacion top pop()");
		System.out.println(stackLink.pop());
		System.out.println("Busqueda de un elemento search()");
		System.out.println(stackLink.search(11));
		System.out.println();
		
	}

}
