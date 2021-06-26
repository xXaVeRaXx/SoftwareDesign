
public class SemaforoRojo extends EstadoSemaforo{
	
	public SemaforoRojo(Semaforo semaforo) {
		super(semaforo);
	}
	
	public void mensajeSemaforo() {
		System.out.println("El sem�foro est� en rojo, detenga el veh�culo.");
	}
	
	public EstadoSemaforo estadoSiguiente() {
		return new SemaforoVerde(semaforo);
	} 

}
