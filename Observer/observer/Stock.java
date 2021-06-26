package observer;
import java.util.ArrayList;
import java.util.List;


public class Stock implements Observador {
	
	private Libros libro;
	private List<Integer> librosDañados= new ArrayList<Integer>();
	
	
	
	
	
	public Stock(Libros libro) {
		super();
		this.libro = libro;
		libro.agregar(this);
	}

	@Override
	public void actualiza() {
		añadirLibroDañado(libro.getNumSerie());

	}
	
	private void añadirLibroDañado(int num) {
		librosDañados.add(num);
	}
	
	public void imprimir() {
		int aux=1;
		for(Integer num : librosDañados) {
			
			System.out.println(aux++ +"º  "+ num);
			
		}
	}

}
