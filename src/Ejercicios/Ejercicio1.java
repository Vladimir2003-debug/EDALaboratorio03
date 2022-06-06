package Ejercicios;

/**En esta clase se desarrolla el ejercicio 1
 * con arreglos estandar  que simulan ser pilas
 * @autor Sulla Quispe Vladimir Arturo
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        /*pilas
         * h[0] es el fondo de la pila y
         * h[h.length] es el tope de la pila
         */
    	int[] h1 = {1,1,1,2,3};
        int[] h2 = {2,3,4};
        int[] h3 = {1,4,1,1};
        
        System.out.println(print(h1));
        System.out.println(print(h2));
        nivelar(h1,h2);

        System.out.println(print(h1));
        System.out.println(print(h2));
        nivelar(h2,h3);
        
        System.out.println(print(h1));
        System.out.println(print(h2));
        System.out.println(print(h3));
        
    }
    /**
     * Metodo que iguala mediante pop dos arreglos/pilas
     * @param s1 arreglo 1
     * @param s2 arreglo 2
     */
    public static void nivelar(int[] s1, int [] s2 ) {
    	
    	int size1,size2;
    	while(true) {
    		size1 = sumStackSize(s1);
    		size2 = sumStackSize(s2);
    		if(size1 == size2)
    			break;
    		else if(size1>size2)
    			pop(s1);
    		else
    			pop(s2);
    	}
    }
    
    /**
     * Metodo que suma los elementos de una pila
     */
    public static int sumStackSize(int[] s) {
    	int sum = 0;
    	for (int i = 0; i < s.length; i++) {
			sum += s[i];
		}
    	return sum;
    }
    
    /**
     * Metodo pop de stack
     * @param s El arreglo que actua como pila
     */
    public static void pop(int[] s) {
    	if(s[0] == 0)
    		throw new NullPointerException("pila vacia");
    	
    	int i = s.length - 1;
    	while(s[i] == 0 && i >= 0)
    		i--;
    	s[i] = 0;
    }
    
    
    /**
     * Este metodo imprime un arreglo estandar
     * @param s el arreglo a imprimir
     * @return txt el String que contiene los elementos del arreglo
     */
    public static String print(int[] s) {
    	String txt = "";
    	for (int i = 0; i < s.length; i++) {
			txt += s[i] + " ";
		}
    	return txt;
    }
    
    
}
