
public class MotorElectricoAdapter extends Motor{

	private MotorElectrico motor;
	
	public MotorElectricoAdapter(MotorElectrico motor) {
		this.motor = motor;
	}
	
	public void encender() {
		motor.conectar();
		motor.activar();
	}
	
	public void acelerar() {
		motor.moverMasRapido();
	}
	
	public void apagar() {
		motor.detener();
		motor.desconectar();
	}
	
}
