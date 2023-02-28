package n1exercici2;

import java.util.*;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> cadenaNumeros=new ArrayList<Integer>();
		
		cadenaNumeros.add(1);
		cadenaNumeros.add(2);
		cadenaNumeros.add(3);
		
		List<Integer> segundaCadenaNumeros=new ArrayList<Integer>();
		
			//en la cadena inversa le indicamos que queremos que inicie en la ultima posicion
		ListIterator <Integer> cadenaInversa = cadenaNumeros.listIterator(cadenaNumeros.size());
		
		while(cadenaInversa.hasPrevious()) {
			
			segundaCadenaNumeros.add(cadenaInversa.previous());
		}
		System.out.println(cadenaNumeros);
		System.out.println(segundaCadenaNumeros);
	}

}
