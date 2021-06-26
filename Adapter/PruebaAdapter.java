import java.util.Scanner;

public class PruebaAdapter {
	
	public static void main(String[] args) {
		
		Motor motor;
		int n = 0;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			do {
				
				System.out.println("Elija el tipo de motor que quiere probar");
				System.out.println("1. Motor Com�n");
				System.out.println("2. Motor Econ�mico");
				System.out.println("3. Motor El�ctrico");
				System.out.println("4. No quiero seguir probando motores");
				n = sc.nextInt();
				System.out.println();
				
				switch (n) {
					case 1:
						System.out.println("Ha eligido el motor com�n.");
						motor = new MotorComun();
						motor.encender();
						motor.acelerar();
						motor.apagar();
						System.out.println("Puede probar otro motor o el mismo de nuevo.");
						System.out.println();
						break;
					case 2:
						System.out.println("Ha eligido el motor econ�mico.");
						motor = new MotorEconomico();
						motor.encender();
						motor.acelerar();
						motor.apagar();
						System.out.println("Puede probar otro motor o el mismo de nuevo.");
						System.out.println();
						break;
					case 3:
						System.out.println("Ha eligido el motor el�ctrico.");
						motor = new MotorElectricoAdapter(new MotorElectrico());
						motor.encender();
						motor.acelerar();
						motor.apagar();
						System.out.println("Puede probar otro motor o el mismo de nuevo.");
						System.out.println();
					case 4:
						System.out.println("Ha eligido no querer seguir probando motores.");
						break;
					default:
						System.out.println("�Ese motor no existe!");
						System.out.println();
						break;
				}
				
			}while(n != 4);
			
		}catch(Exception e){
			System.out.println();
			System.err.println("Has puesto un car�cter que no es un n�mero entero." + e);
		}
		
		sc.close();
	}

}
