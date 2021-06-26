
public class NinioBanio extends Decorator{

	public NinioBanio(Component componente) {
		super(componente);
	}
	
	@Override
	public String getDescription() {
		return getComponent().getDescription() + " Ha ido al ba�o en lugar de hac�rselo en el pa�al.";
	}
	
	@Override
	public String getAdicional() {
		return getComponent().getAdicional() + " Recibe un certificado.";
	}
	
	@Override
	public void getTituloCuento() {
	}
	
}
