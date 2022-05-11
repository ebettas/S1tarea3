import java.util.*;

public class Main {

	public static void main(String[] args) {

		ArrayList<Month> meses = new ArrayList<Month>();

		meses.add(new Month("Enero"));
		meses.add(new Month("Febrero"));
		meses.add(new Month("Marzo"));
		meses.add(new Month("Abril"));
		meses.add(new Month("Mayo"));
		meses.add(new Month("Junio"));
		meses.add(new Month("Julio"));
		meses.add(new Month("Septiembre"));
		meses.add(new Month("Octubre"));
		meses.add(new Month("Noviembre"));
		meses.add(new Month("Diciembre"));

		System.out.println("ArrayList sin Agosto");

		for (Month x : meses) {

			System.out.println(x.getName());
		}

		meses.add(7, new Month("Agosto"));// Se agrega Agosto a la lista en su posición

		System.out.println("ArrayList con Agosto");

		for (Month x : meses) {

			System.out.println(x.getName());
		}

		HashSet<Month> listaMeses = new HashSet<Month>(); // creacion HashSet

		listaMeses.addAll(meses); // Traspaso de objetos del ArrayList al HashSet

		System.out.println("Impresion del nuevo HashSet");

		for (Month x : listaMeses) {

			System.out.println(x.getName());
		}

		listaMeses.add(new Month("Enero"));// nuevo elemento duplicado en el HashSet

		Iterator<Month> iteradorListaMeses = listaMeses.iterator();// creacion iterador

		System.out.println("Impresion del HashSet con iterador");

		while (iteradorListaMeses.hasNext()) {

			System.out.println(iteradorListaMeses.next().getName());
		}
		System.out.println("Impresion del HashSet con bucle for");

		for (Month x : listaMeses) {
			System.out.println(x.getName());
		}
	}
}
