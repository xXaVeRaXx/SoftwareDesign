
public class MotorElectrico {
	
	private boolean conectado;
	
	public MotorElectrico() {
		this.conectado = false;
	}
	
	public void conectar() {
		this.conectado = true;
		System.out.println("Conectando motor eléctrico.");
	}
	
	public void activar() {
		if (!this.conectado) 
			System.out.println("No se puede activar porque no está conectado el motor eléctrico.");		
		else 
			System.out.println("Está conectado, activando motor eléctrico.");		
	}
	
	public void moverMasRapido() {
		if (!this.conectado) 
			System.out.println("No se puede mover rápido el motor eléctrico porque no está conectado.");		
		else 
			System.out.println("Moviendo más rápido, aumentando voltaje motor eléctrico.");		
	}
	
	public void detener() {
		if (!this.conectado) 
			System.out.println("No se puede detener el motor eléctrico porque no está conectado.");		
		else 
			System.out.println("Deteniendo motor eléctrico.");		
	}
	
	public void desconectar() {
		this.conectado = false;
		System.out.println("Desconectando motor eléctrico.");
	}

}
