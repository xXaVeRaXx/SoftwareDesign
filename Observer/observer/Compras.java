package observer;
import java.util.ArrayList;
import java.util.List;


public class Compras implements Observador {
	
	private Libros libro;
	private List<String> titulosAComprar= new ArrayList<String>();
	
	

	public Compras(Libros libro) {
		super();
		this.libro = libro;
		libro.agregar(this);
	}

	@Override
	public void actualiza() {
		this.a�adirTituloAComprar(libro.getNombre());
		System.out.println("el nombre es " + libro.getNombre());
	}
	
	private void a�adirTituloAComprar(String titulo) {
		titulosAComprar.add(titulo);
		
	}
	
	public void imprimir() {
		int aux=1;
		for(String num : titulosAComprar) {
			
			System.out.println(aux++ +"�  "+ titulosAComprar);
			
		}
	}

}
