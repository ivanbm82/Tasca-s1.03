package n2exercici1;

import java.util.*;

public class App {

	public static void main(String[] args) {
		

		
		HashSet<Restaurante> rest1=new HashSet<>() ;
		
		Restaurante a=new Restaurante ("Pepe",3);
		Restaurante b=new Restaurante ("Novo", 9);
		Restaurante c= new Restaurante("Nandos", 5);
		Restaurante d=new Restaurante("Nandos", 5);
	
		
		
		
		rest1.add(a);
		rest1.add(b);
		rest1.add(c);
		rest1.add(d);
		
		for (Restaurante restaurante : rest1) {
			System.out.println(restaurante);

		}
	//	System.out.println(rest1);
		


	}

}
