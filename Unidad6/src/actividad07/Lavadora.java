package actividad07;

public class Lavadora extends Electrodomestico {
	
	private int carga;
	
	protected static final int CARGA_DEFECTO = 5;
	
	public Lavadora() {
		
		super();
		this.carga = CARGA_DEFECTO;
	}
	
	public Lavadora(double precioBase, int peso) {
		
		super(COLOR_DEFECTO, CONSUMO_DEFECTO, precioBase, peso);
		this.carga = CARGA_DEFECTO;
	}
	
	public Lavadora(String color, char consumo, double precioBase, int peso, int carga) {
		
		super(color, consumo, precioBase, peso);
		this.carga = carga;
	}
	
	public int getCarga() {
		
		return carga;
	}
	
	@Override
	public void precioFinal() {
		
		super.precioFinal();
		
		if(carga > 30) {
			
			precioBase += 50;
		}
	}
}










