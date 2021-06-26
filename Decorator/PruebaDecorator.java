import java.util.Scanner;

public class PruebaDecorator {

	public static void main(String[] args) {
		
		Ninio ninio = new Ninio();
		
		NinioBanio ninio_banio = new NinioBanio(ninio);
		NinioSemana ninio_semana = new NinioSemana(ninio_banio);
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Elija el tipo de niño:");
			System.out.println("1. Niño normal");
			System.out.println("2. Niño que sabe ir al baño");
			System.out.println("3. Niño de la semana");
			int n = sc.nextInt();
			System.out.println();
			
			switch (n) {
				case 1:
					System.out.println("Niño: " + ninio.getDescription());
					System.out.println("Adicional: " + ninio.getAdicional());
					break;
				case 2:
					System.out.println("Niño: " + ninio_banio.getDescription());
					System.out.println("Adicional: " + ninio_banio.getAdicional());
					break;
				case 3:
					System.out.println("Niño: " + ninio_semana.getDescription());
					System.out.println("Adicional: " + ninio_semana.getAdicional());
					System.out.println("Título del cuento:");
					ninio_semana.getTituloCuento();
					break;
				default:
					System.out.println("¡No existe ese tipo de niño!");
					break;
			}
			
		}catch(Exception e){
			System.out.println();
			System.err.println("Has puesto un carácter que no es un número entero." + e);
		}
		
		sc.close();
	}
}
