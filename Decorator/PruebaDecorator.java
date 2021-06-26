import java.util.Scanner;

public class PruebaDecorator {

	public static void main(String[] args) {
		
		Ninio ninio = new Ninio();
		
		NinioBanio ninio_banio = new NinioBanio(ninio);
		NinioSemana ninio_semana = new NinioSemana(ninio_banio);
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Elija el tipo de ni�o:");
			System.out.println("1. Ni�o normal");
			System.out.println("2. Ni�o que sabe ir al ba�o");
			System.out.println("3. Ni�o de la semana");
			int n = sc.nextInt();
			System.out.println();
			
			switch (n) {
				case 1:
					System.out.println("Ni�o: " + ninio.getDescription());
					System.out.println("Adicional: " + ninio.getAdicional());
					break;
				case 2:
					System.out.println("Ni�o: " + ninio_banio.getDescription());
					System.out.println("Adicional: " + ninio_banio.getAdicional());
					break;
				case 3:
					System.out.println("Ni�o: " + ninio_semana.getDescription());
					System.out.println("Adicional: " + ninio_semana.getAdicional());
					System.out.println("T�tulo del cuento:");
					ninio_semana.getTituloCuento();
					break;
				default:
					System.out.println("�No existe ese tipo de ni�o!");
					break;
			}
			
		}catch(Exception e){
			System.out.println();
			System.err.println("Has puesto un car�cter que no es un n�mero entero." + e);
		}
		
		sc.close();
	}
}
