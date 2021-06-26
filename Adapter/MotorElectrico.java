
public class MotorElectrico {
	
	private boolean conectado;
	
	public MotorElectrico() {
		this.conectado = false;
	}
	
	public void conectar() {
		this.conectado = true;
		System.out.println("Conectando motor el�ctrico.");
	}
	
	public void activar() {
		if (!this.conectado) 
			System.out.println("No se puede activar porque no est� conectado el motor el�ctrico.");		
		else 
			System.out.println("Est� conectado, activando motor el�ctrico.");		
	}
	
	public void moverMasRapido() {
		if (!this.conectado) 
			System.out.println("No se puede mover r�pido el motor el�ctrico porque no est� conectado.");		
		else 
			System.out.println("Moviendo m�s r�pido, aumentando voltaje motor el�ctrico.");		
	}
	
	public void detener() {
		if (!this.conectado) 
			System.out.println("No se puede detener el motor el�ctrico porque no est� conectado.");		
		else 
			System.out.println("Deteniendo motor el�ctrico.");		
	}
	
	public void desconectar() {
		this.conectado = false;
		System.out.println("Desconectando motor el�ctrico.");
	}

}
