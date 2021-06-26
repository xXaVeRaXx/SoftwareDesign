
public abstract class EstadoSemaforo {

	protected Semaforo semaforo;
	
	public EstadoSemaforo(Semaforo semaforo) {
		this.semaforo = semaforo;
	}
	
	public abstract void mensajeSemaforo();
	public abstract EstadoSemaforo estadoSiguiente();
}
