
public class ContextoTransporte {

	private InterfazTransporte factura;
	
	public ContextoTransporte (InterfazTransporte factura) {
		this.factura = factura;
	}
	
	public void ejecutarFactura() {
		factura.Imprimirfactura();
	}
}
