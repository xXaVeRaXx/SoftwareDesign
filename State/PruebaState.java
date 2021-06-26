
public class PruebaState {
	
	public static void main(String[] args) {
		
		Semaforo semaforo = new Semaforo();
		
		semaforo.mensajeSemaforo();
		semaforo.estadoSiguiente();
		
		System.out.println();
		
		semaforo.mensajeSemaforo();
		semaforo.estadoSiguiente();
		
		System.out.println();
		
		semaforo.mensajeSemaforo();
	}

}
