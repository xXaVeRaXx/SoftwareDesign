
public class Semaforo {
	
	protected EstadoSemaforo estadoSemaforo;
	
	public Semaforo() {
		estadoSemaforo = new SemaforoVerde(this);	 
	}
	
	public void mensajeSemaforo() {
		estadoSemaforo.mensajeSemaforo();
	}
	
	public void estadoSiguiente() {
		estadoSemaforo = estadoSemaforo.estadoSiguiente();
	}

}
