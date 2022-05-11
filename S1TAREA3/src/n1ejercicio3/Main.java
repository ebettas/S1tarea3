package n1ejercicio3;

import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		int puntos=0;
		
		HashMap<String,String> capitalesAmerica = new HashMap<String,String>();
		
		try {
			BufferedReader bf = new BufferedReader(new FileReader("countries.txt"));
			
			do  {
				String [] clavesYvalores = bf.readLine().split("-");
				//String pais = clavesYvalores [0];
				//String capital = clavesYvalores [1];
				capitalesAmerica.put(clavesYvalores[0],clavesYvalores[1]);
			} while (bf.readLine()!=null);
			
			bf.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		Random r =new Random();
		
		ArrayList<String> claves = new ArrayList<String>(capitalesAmerica.keySet());
		
		String nombre=introCadena("Bienvenido al juego de las capitales\nEscriba su nombre: ");
			
		for (int i=1; i<=10; i++ )  {
			
			String pregunta =claves.get(r.nextInt(claves.size()));
			
			String respuesta=introCadena("Escriba a continuación la capital de " + pregunta +" ");
			
			if (respuesta.equalsIgnoreCase(capitalesAmerica.get(pregunta))) {
				puntos =+1;
				System.out.println("Felicidades. Ha ganado un punto");
			} else {
				System.out.println("Respuesta incorrecta. La capital es "+capitalesAmerica.get(pregunta));
			}
		}
		
		System.out.println("Fin del juego.\n"+nombre+" ha conseguido "+puntos+" puntos.");
		try {
			BufferedWriter otroBf = new BufferedWriter(new FileWriter("clasificacion.txt"));
			otroBf.write("Participante: "+nombre+"  Puntos conseguidos: "+puntos);
			otroBf.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
	}
	static String introCadena(String texto)  {
		Scanner input= new Scanner(System.in);
		System.out.print(texto);
		return input.nextLine(); 
	}
}
