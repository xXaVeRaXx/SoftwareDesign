
public class SemaforoAmbar extends EstadoSemaforo{
	
	public SemaforoAmbar(Semaforo semaforo) {
		super(semaforo);
	}
	
	public void mensajeSemaforo() {
		System.out.println("El semáforo está en ámbar, debe reducir la velocidad");
	}
	
	public EstadoSemaforo estadoSiguiente() {
		return new SemaforoRojo(semaforo);
	} 

}
