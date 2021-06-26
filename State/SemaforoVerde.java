
public class SemaforoVerde extends EstadoSemaforo{
	
	public SemaforoVerde(Semaforo semaforo) {
		super(semaforo);
	}
	
	public void mensajeSemaforo() {
		System.out.println("El semáforo está en verde, puede pasar");
	}
	
	public EstadoSemaforo estadoSiguiente() {
		return new SemaforoAmbar(semaforo);
	} 

}
