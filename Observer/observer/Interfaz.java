package observer;
import java.util.*;

public class Interfaz {
	
	private Libros libro;
	private Stock stock;
	private Compras compras;
	private Administracion administracion;
	
	
	public Interfaz(Libros libro, Stock stock, Compras compras, Administracion administracion) {
		super();
		this.libro = libro;
		this.stock = stock;
		this.compras = compras;
		this.administracion = administracion;
	}
	
	public int mostrarMenu() {
		System.out.println("________________________________________");
		System.out.println("| Escoja la opcion que desea realizar   |");
		System.out.println("|       1º devolver libro               |");
		System.out.println("|       2º ver stock de libros a reponer|");
		System.out.println("|       3º ver libros a comprar         |");
		System.out.println("|       4º ver gastos en libros dañados |");
		System.out.println("|       5º salir                        |");
		System.out.println("________________________________________");
		Scanner sc = new Scanner(System.in);
		int error;
		int opcion;
		int terminar=0;
		do{
			opcion = sc.nextInt();
			error  = 0;
			switch (opcion) {
			
			case 1:
				this.devolucion();
				break;
				
			case 2:
				
				stock.imprimir();
				break;
				
			case 3:
				
				compras.imprimir();
				break;
				
			case 4: 
				
				administracion.imprimir();
				break;
				
			case 5:
				
				terminar++;
				break;
								
			default:
				
				System.out.println("Porfavor introduzca un valor valido");
				error++;

			}
				
		}while(error!=0);
		
		return terminar;
		
	}
	
	
	public void devolucion() {
		
		System.out.println("________________________________________");
		System.out.println("|   Introduzca el titulo del libro a    |");
		System.out.println("|             a devolver:               |");
		System.out.println("________________________________________");
		
		Scanner st = new Scanner(System.in);
		String titulo= st.nextLine();
		
		System.out.println("________________________________________");
		System.out.println("|   Introduzca el numero de serie       |");
		System.out.println("|        del libro a devolver:          |");
		System.out.println("________________________________________");
		
		int numSerie = st.nextInt();
		
		libro.nuevoLibro(titulo, numSerie);
		
		
		System.out.println("________________________________________");
		System.out.println("| ¿Se encuentra en mal estado el libro? |");
		System.out.println("|        1º SI                          |");
		System.out.println("|        2º NO                          |");
		System.out.println("________________________________________");
		
		int opcion;
		int error;
		do {
			
			error=0;
			opcion = st.nextInt();
			
			switch (opcion) {
			
				case 1:
					libro.devuelveLibro(true);
					break;
					
				case 2:
					
					System.out.println("Gracias por cuidar el material");
					break;
					
				default:
					error++;
					System.out.println("Introduzca un valor valido");
			}
				
		}while(error!=0);
		
	
	}

}
