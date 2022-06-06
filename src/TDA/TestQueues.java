package TDA;
/**
 * Arcvhio donde se evaluan los metodos de colas
 * @author Sulla Quispe Vladimir Arturo
 */
public class TestQueues {

	public static void main(String[] args) {
		//QUEUES TEST
		QueueLink<Integer> queueLink = new QueueLink<Integer>();
		QueueArray<Integer> queueArray = new QueueArray<Integer>();
		System.out.println("QUEUELINK");
		queueLink.add(12);
		queueLink.add(2);
		queueLink.add(14);
		System.out.println(queueLink);
		System.out.println("Elemento head peek()");
		System.out.println(queueLink.peek());
		System.out.println("Elemento head element()");
		System.out.println(queueLink.element());
		System.out.println("Eliminacion del head poll()");
		System.out.println(queueLink.poll());
		System.out.println(queueLink);
		System.out.println();
		
		System.out.println("QUEUEARRAY");
		queueArray.add(12);
		queueArray.add(2);
		queueArray.add(14);
	    System.out.println(queueArray);
		System.out.println("Elemento head peek()");
		System.out.println(queueArray.peek());
		System.out.println("Elemento head element()");
		System.out.println(queueArray.element());
		System.out.println("Eliminacion del head poll()");
		System.out.println(queueArray.poll());
		System.out.println(queueArray);
	}

}
