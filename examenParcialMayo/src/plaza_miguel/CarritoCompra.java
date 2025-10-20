package plaza_miguel;

import java.util.*;

public class CarritoCompra {
	// Ã�rea de datos
	private ArrayList<CarritoCompra> carrito;
	
	//Constructor
	public CarritoCompra() {
		carrito = new ArrayList<>();
	}
	
	//MÃ©todos	
	public void agregarProductos() {
		Scanner sc2 = new Scanner(System.in);
		int opc=-1;
		do {
			System.out.println ("¿Que producto desea agregar?");
			System.out.println ("1. Tornillos");
			System.out.println ("2. Bombillas");
			opc = sc2.nextInt();
		} while (opc!=1 && opc!=2);
		sc2.nextLine();
		
		System.out.println("ID del producto: ");
		String id=sc2.nextLine();
		System.out.println("Precio del producto: ");
		double precio=sc2.nextDouble();
		if (opc==1) {
			System.out.println("Medida del producto: ");
			int medida=sc2.nextInt();
			//completar cÃ³digo
			carrito.add(String id, double precio, int medida);
		} 
		
		else {
			System.out.println("Lumenes del producto: ");
			int lumes=sc2.nextInt();
			//completar cÃ³digo
			carrito.add(new (id, precio, lumes));
		}
		
		sc2.nextLine();		
		System.out.println("Producto agregado al carrito");	
	}
	
	public void vaciarCarrito() {
		//completar cÃ³digo
		for(CarritoCompra carro : carrito) {
			
			carrito.remove(carro);
		}
		
		System.out.println("Se ha vaciado tu carrito de la compra.");
	}
	
	public double calcularTotalCompra() {
		double totalCarrito=0;
		//completar cÃ³digo
		for(CarritoCompra carro : carrito) {
			
			totalCarrito += carrito.get(1);
		}
		
		
		System.out.println("Importe total: "+ totalCarrito);
		return totalCarrito;
	}
	
	// Muestra todos los productos aÃ±adidos al carrito
	public void verProductos() {
		
		if (carrito.size() <= 0) {
			
			System.out.println("No hay ningÃºn producto en el carrito.");
		}

		else {
			//completar cÃ³digo
			for(CarritoCompra carro : carrito) {
				
				System.out.print(carro + ", ");
			}
		}
	}				
}
