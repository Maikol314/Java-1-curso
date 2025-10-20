package plaza_miguel;

import java.util.*;

public class AppTienda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CarritoCompra carrito = new CarritoCompra();
		int opcion=-1;
		
		//completar c√≥digo
		
		do {
		
			System.out.println("******App Tienda******");
			System.out.println("Introduce tu opci√≥n");
			System.out.println("1. Agregar producto al carrito.");
			System.out.println("2. Vaciar carrito.");
			System.out.println("3. Calcular total de la compra.");
			System.out.println("4. Mostrar detalle de los productos a√±adidos.");
			System.out.println("5. Salir");
			opcion=sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				
				carrito.agregarProductos();
				
				break;
				
			case 2:
				
				carrito.vaciarCarrito();
				
				break;
				
			case 3:
				
				carrito.calcularTotalCompra();
				
				break;
				
			case 4:
				
				carrito.verProductos();
				
				break;
				
			case 5:
				
				System.out.println("Saliendo del programa...");
				
				break;
				
			default:
				
				System.out.println("OpciÛn no v·lida, escoge otra");
				
				break;
				
			}
			
		} while(opcion != 5);
		
		sc.close();
	}		
}
