package observer_interfaz;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.List;


public class Stock implements Observer {
	
	private Observable observable;
	private List<Integer> librosDa�ados= new ArrayList<Integer>();
	
	
	
	
	
	public Stock(Observable observable) {
		super();
		this.observable=observable;
		observable.addObserver(this);
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

	@Override
	public void update(Observable obs, Object arg1) {
		
		if(obs instanceof Libros) {
		Libros libro = (Libros)obs;
		a�adirLibroDa�ado(libro.getNumSerie());		
	
		}
	}

}
