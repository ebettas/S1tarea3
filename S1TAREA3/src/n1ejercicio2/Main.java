package n1ejercicio2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
			
		ArrayList<Integer> listaNumAsc = new ArrayList<Integer>(); 
		
		for (int i=1; i<11;i++) {
			listaNumAsc.add(i);
		}
		for(int x : listaNumAsc) {
			System.out.println(x);
		}
		ArrayList<Integer> listaNumDesc = new ArrayList<Integer>();
		
		ListIterator<Integer> iterador = listaNumAsc.listIterator(listaNumAsc.size());
		
		while (iterador.hasPrevious()) {
			listaNumDesc.add(iterador.previous());
		}
		for (int x : listaNumDesc) {
			System.out.println(x);
		}
	}
}
