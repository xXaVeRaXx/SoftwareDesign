
public class SemaforoRojo extends EstadoSemaforo{
	
	public SemaforoRojo(Semaforo semaforo) {
		super(semaforo);
	}
	
	public void mensajeSemaforo() {
		System.out.println("El semáforo está en rojo, detenga el vehículo.");
	}
	
	public EstadoSemaforo estadoSiguiente() {
		return new SemaforoVerde(semaforo);
	} 

}
