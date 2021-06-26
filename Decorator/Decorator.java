
public abstract class Decorator implements Component{

	private Component componente;
	
	public Decorator (Component componente) {
		setComponent(componente);
	}
	
	protected Component getComponent() {
		return componente;
	}
	
	protected void setComponent(Component componente) {
		this.componente = componente;
	}
}

