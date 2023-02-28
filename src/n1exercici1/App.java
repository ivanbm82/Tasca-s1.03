package n1exercici1;

import java.util.*;

public class App {
	
	public static void main(String[] args) {
		
		ArrayList <Month> meses = new ArrayList<Month>();
		Month mes1= new Month("Enero");
		Month mes2= new Month("Febrero");
		Month mes3= new Month("Marzo");
		Month mes4= new Month("Abril");
		Month mes5= new Month("Mayo");
		Month mes6= new Month("Junio");
		Month mes7= new Month("Julio");

		Month mes9= new Month("Septiembre");
		Month mes10= new Month("Octubre");
		Month mes11= new Month("Noviembre");
		Month mes12= new Month("Diciembre");
		meses.add(mes1);
		meses.add(mes2);
		meses.add(mes3);
		meses.add(mes4);
		meses.add(mes5);
		meses.add(mes6);
		meses.add(mes7);
		meses.add(mes9);
		meses.add(mes10);
		meses.add(mes11);
		meses.add(mes12);
				
		Month mes8= new Month("Agosto");
		meses.add(7, mes8);

		System.out.println(meses);
		
		Set<Month> mesesHashSet = new HashSet<> (meses);
		
		System.out.println(mesesHashSet.size());

		mesesHashSet.add(mes4);//No se puede duplicar el mismo objeto en la lista

		System.out.println(mesesHashSet.size());
		//Al ser un HashSet se imprimira sin orden
		for (Month month : mesesHashSet) {
			System.out.println(month);
			
		}
		
		Iterator < Month > mesesIterator = mesesHashSet.iterator();
		
			while (mesesIterator.hasNext()) {
		
				System.out.println(mesesIterator.next());
		}
			
		
		
	}

}
