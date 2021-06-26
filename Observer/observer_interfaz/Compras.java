package observer_interfaz;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.List;


public class Compras implements Observer {
	
	private Observable observable;
	private List<String> titulosAComprar= new ArrayList<String>();
	
	

	public Compras(Observable observable) {
		super();
		this.observable=observable;
		observable.addObserver(this);
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

	@Override
	public void update(Observable obs, Object arg1) {
		if(obs instanceof Libros) {
			Libros libro = (Libros)obs;
			this.a�adirTituloAComprar(libro.getNombre());
			//System.out.println("el nombre es " + libro.getNombre());	
		
		}		
	}

}
