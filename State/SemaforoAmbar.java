
public class SemaforoAmbar extends EstadoSemaforo{
	
	public SemaforoAmbar(Semaforo semaforo) {
		super(semaforo);
	}
	
	public void mensajeSemaforo() {
		System.out.println("El sem�foro est� en �mbar, debe reducir la velocidad");
	}
	
	public EstadoSemaforo estadoSiguiente() {
		return new SemaforoRojo(semaforo);
	} 

}
