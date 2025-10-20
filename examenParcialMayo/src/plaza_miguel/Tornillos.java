package plaza_miguel;

public class Tornillos extends Producto {
	//área de datos
	private int medida;
	
	// constructor
	public Tornillos (String id, double precio, int medida ){
		
		super(id, precio);
		this.medida=medida;
	}
	
	//Métodos
	public int getMedida() {
		
		return medida;
	}
	
	public void setMedida(int medida) {
		
		this.medida = medida;
	}
		
	@Override
	// Debe retornar una representación del Tornillo
	// Identificador, precio, medida y categoria.
	public String toString() {
		
		return super.toString() + "\n- Medida: " + medida + "\n- Categoria" + super.getCategoria();
	}
	
	
}
