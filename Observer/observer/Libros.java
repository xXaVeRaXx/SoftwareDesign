package observer;

import java.util.ArrayList;
import java.util.List;


public class Libros implements Sujeto {
	
	protected List<Observador> observadores = new ArrayList<Observador>();
	private String nombre;
	private int precio;
	private int numSerie;
	private boolean malEstado;
	
	public Libros() {
		this.nuevoLibro("El cid", 123456765);
		
	}

	public String getNombre() {
		return nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public int getNumSerie() {
		return numSerie;
	}

	public boolean isMalEstado() {
		return malEstado;
	}
	
	public void nuevoLibro(String nombre, int numSerie) {
		this.nombre=nombre;
		this.numSerie=numSerie;
		this.precio=(int)(Math.random()*27+5);
		this.malEstado=false;
		
	}

	@Override
	public void agregar(Observador observador) {
		observadores.add(observador);

	}

	@Override
	public void eliminar(Observador observador) {
		observadores.remove(observador);

	}

	@Override
	public void notificar() {
		for (Observador observador : observadores)
			observador.actualiza();

	}
	
	public void devuelveLibro(boolean estado) {
		
		this.malEstado = estado;
		
		if(malEstado)
			this.notificar();
		
	}

}
