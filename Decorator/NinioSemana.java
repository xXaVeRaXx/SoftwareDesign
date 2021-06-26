import java.util.Scanner;

public class NinioSemana extends Decorator{

	public NinioSemana(Component componente) {
		super(componente);
	}
	
	@Override
	public String getDescription() {
		return getComponent().getDescription() + " Elegido niño de la semana.";
	}
	
	@Override
	public String getAdicional() {
		return getComponent().getAdicional() + " Recibe un cuento.";
	}
	
	@Override
	public void getTituloCuento() {
		String titulo = null;
		
		System.out.println("¿Cuál es el título del cuento?");
		
		Scanner sc = new Scanner(System.in);
		titulo = sc.nextLine();
		
		System.out.println("El título del cuento es: " + titulo);
		
		sc.close();
		
	}
	
}
