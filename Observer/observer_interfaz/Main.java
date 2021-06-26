package observer_interfaz;

public class Main {

	public static void main(String[] args) {
		
		Libros libro = new Libros();
		
		Stock stock = new Stock(libro);
		Compras compra = new Compras(libro);
		Administracion administracion = new Administracion(libro,0);
		
		Interfaz interfaz = new Interfaz(libro, stock, compra, administracion);
		int aux;
		do {
			
			aux = interfaz.mostrarMenu();
		}while(aux == 0);
		

	}

}
