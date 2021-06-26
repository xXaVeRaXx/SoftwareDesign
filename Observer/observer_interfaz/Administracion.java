package observer_interfaz;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.List;

public class Administracion implements Observer {
	
	private Observable observable;
	private int gastos;
	

	public Administracion(Observable observable, int gastos) {
		super();
		this.gastos = gastos;
		this.observable=observable;
		observable.addObserver(this);
	}

	
	public void imprimir() {
		
		System.out.println("Los gastos totales son : " + gastos+"$");
		
	}


	@Override
	public void update(Observable obs, Object arg1) {
		if(obs instanceof Libros) {
			Libros libro = (Libros)obs;
			this.gastos += libro.getPrecio();
		
		}		
	}

	
}
