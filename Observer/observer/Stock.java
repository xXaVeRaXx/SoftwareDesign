package observer;
import java.util.ArrayList;
import java.util.List;


public class Stock implements Observador {
	
	private Libros libro;
	private List<Integer> librosDa�ados= new ArrayList<Integer>();
	
	
	
	
	
	public Stock(Libros libro) {
		super();
		this.libro = libro;
		libro.agregar(this);
	}

	@Override
	public void actualiza() {
		a�adirLibroDa�ado(libro.getNumSerie());

	}
	
	private void a�adirLibroDa�ado(int num) {
		librosDa�ados.add(num);
	}
	
	public void imprimir() {
		int aux=1;
		for(Integer num : librosDa�ados) {
			
			System.out.println(aux++ +"�  "+ num);
			
		}
	}

}
