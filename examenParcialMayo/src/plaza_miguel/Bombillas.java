package plaza_miguel;

public class Bombillas extends Producto {
	//Ã�rea de datos
	private int lumenes;
	
	//Constructores
	public Bombillas(String id, double precio, int lumenes){
		
		super(id, precio);
		this.lumenes=lumenes;
	}
	
	//MÃ©todos
	public int getLumenes() {
		
		return lumenes;
	}
	
	public void setLumenes(int lumenes) {
		
		this.lumenes = lumenes;
	}
	
	@Override
	// Debe retornar una representaciÃ³n de las bombillas
	// Identificador, precio, lumenes y categoria.
	public String toString() {
		
		return super.toString() + "\n- Lumenes: " + lumenes + "\n- Categoria" + super.getCategoria();
	}
	
}
