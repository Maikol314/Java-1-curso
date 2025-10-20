package plaza_miguel;

public class Producto {
	// Ã�rea de datos
	private String id;
	private double precio;	
	
	// Constructor
	Producto(String id, double precio){
		this.id=id;
		this.precio=precio;
	}

	// MÃ©todos getter y setter
	public String getId() {
		return id;
	}

	public double getPrecio() {
		return precio;
	}
	
	public void setId(String id) {
		
		this.id = id;
	}
	
	public void setPrecio(double precio) {
		
		this.precio = precio;
	}

	@Override
	public String toString() {
		
		return " Id: " + id + "\n- Precio: " + precio;
	}	
	
	// MÃ©todo que retorna un String con la categorÃ­a al
	// que pertenece un determinado producto.
	public String getCategoria() {
		
		return "";
	}
}
