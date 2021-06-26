import java.util.Scanner;

public class PruebaStrategy {
	
	public static void main(String[] args) {
		
		ContextoTransporte c = null;
		String transporte = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Elija el transporte que desea usar");
			System.out.println("1. Helic�ptero");
			System.out.println("2. Jet");
			System.out.println("3. Zepel�n");
			int n = sc.nextInt();
			System.out.println();
			
			switch (n) {
				case 1:
					System.out.println("Ha eligido el transporte helic�ptero.");
					c = new ContextoTransporte(new FacturaHelicoptero());
					transporte = "helic�ptero";
					break;
				case 2:
					System.out.println("Ha eligido el transporte jet.");
					c = new ContextoTransporte(new FacturaJet());
					transporte = "jet";
					break;
				case 3:
					System.out.println("Ha eligido el transporte zepelin.");
					c = new ContextoTransporte(new FacturaZepelin());
					transporte = "zepel�n";
					break;
				default:
					System.out.println("�Opci�n inv�lida!");
					break;
			}
			
			if (n==1 || n==2 || n==3) {
				System.out.println("La factura del " + transporte + " es:");
				c.ejecutarFactura();
			}
			
		}catch(Exception e){
			System.out.println();
			System.err.println("Has puesto un car�cter que no es un n�mero entero." + e);
		}
		
		sc.close();
	}

}
