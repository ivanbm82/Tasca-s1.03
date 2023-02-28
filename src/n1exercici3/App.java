package n1exercici3;

import java.io.*;
import java.util.*;

public class App {
	
	public static void main(String[] args) throws IOException{
	//	 TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);


		HashMap<String, String> archivo=new HashMap<>();
		
		
		try {
			//File archivo=new File ("/Users/navi/Desktop/countries.txt");
			//FileReader archivoLectura= new Filereader (archivo);
			//BufferedReader in = new BufferedReader(archivoLectura);
			BufferedReader in = new BufferedReader(new FileReader (new File ("/Users/navi/Desktop/countries.txt"))); 
			
			String palabra;
			while((palabra=in.readLine())!=null) {
				archivo.put(palabra.split(" ")[0],palabra.split(" ")[1]);
			}
				
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("El archivo no se encuentra");
		}
		
		System.out.println("Introduzca su nombre");
		
		String jugador=input.nextLine();
		
		int puntos=0;
		
		int jugadas =10;
		
		while(jugadas!=0){
			
			String[] lista = archivo.keySet().toArray(new String[0]);
			
	        Random aleatorio = new Random();
			
	        int randomIndex = aleatorio.nextInt(lista.length);
	        
	        String paisRandom = lista[randomIndex];
	        
	        System.out.println("País: " + paisRandom);
	        
	        System.out.println("Introduzca capital");
	        
	        String respuestaJugador=input.nextLine();
	        
	        
	        
	        if(respuestaJugador.equals(archivo.get(paisRandom))) {
	        	
	        	puntos++;
	        	
	        	System.out.println("correcto");
	       
	        }else {
	        	
	        	System.out.println("incorrecto");

	        }
	       
	        jugadas--;
		
		}
		
		
		File nuevoArchivo= new File("/Users/navi/Desktop/clasificacion.txt");
		
		nuevoArchivo.createNewFile();

		try (BufferedWriter nuevoArchivoBuffer = new BufferedWriter(new FileWriter(nuevoArchivo, true))) {
            
			nuevoArchivoBuffer.write( jugador + " ha conseguido "+ puntos + "\n");
        
		} catch (IOException e) {
        
			e.printStackTrace();
        }
	
		
	}
}
		