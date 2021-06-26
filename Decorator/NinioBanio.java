
public class NinioBanio extends Decorator{

	public NinioBanio(Component componente) {
		super(componente);
	}
	
	@Override
	public String getDescription() {
		return getComponent().getDescription() + " Ha ido al baño en lugar de hacérselo en el pañal.";
	}
	
	@Override
	public String getAdicional() {
		return getComponent().getAdicional() + " Recibe un certificado.";
	}
	
	@Override
	public void getTituloCuento() {
	}
	
}
