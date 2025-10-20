package actividad07;

public class Television extends Electrodomestico {
	
	private int resolucion;
	private boolean TDT;
	
	protected static final int RESOLUCION_DEFECTO = 20;
	protected static final boolean TDT_DEFECTO = false;
	
	public Television() {
		
		super();
		this.resolucion = RESOLUCION_DEFECTO;
		this.TDT = TDT_DEFECTO;
	}
	
	public Television(double precioBase, int peso) {
		
		super(COLOR_DEFECTO, CONSUMO_DEFECTO, precioBase, peso);
		this.resolucion = RESOLUCION_DEFECTO;
		this.TDT = TDT_DEFECTO;
	}
	
	public Television(String color, char consumo, double precioBase, int peso, int resolucion, boolean TDT) {
		
		super(color, consumo, precioBase, peso);
		this.resolucion = resolucion;
		this.TDT = TDT;
	}
	
	public int getResolucion() {
		
		return resolucion;
	}
	
	public boolean getTDT() {
		
		return TDT;
	}
	
	@Override
	public void precioFinal() {
		
		super.precioFinal();
		
		if (resolucion > 40) {
			
			double aumento = precioBase * 0.30;
			precioBase += aumento;
		}
		
		if(getTDT()) {
			
			precioBase += 50;
		}
	}
}







