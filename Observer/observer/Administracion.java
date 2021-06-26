package observer;

import java.util.ArrayList;
import java.util.List;

public class Administracion implements Observador {
	
	private Libros libro;
	private int gastos;
	

	public Administracion(Libros libro, int gastos) {
		super();
		this.libro = libro;
		this.gastos = gastos;
		libro.agregar(this);
	}

	
	
	@Override
	public void actualiza() {
		this.gastos += libro.getPrecio();

	}
	
	public void imprimir() {
		
		System.out.println("Los gastos totales son : " + gastos+"$");
		
	}

	
}
