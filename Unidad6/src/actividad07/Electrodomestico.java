package actividad07;

public class Electrodomestico {
	
	protected double precioBase;
	protected String color;
	protected char consumo;
	protected int peso;
	
	protected static final double PRECIO_BASE_DEFECTO = 100.0;
	protected static final String COLOR_DEFECTO = "Blanco";
	protected static final char CONSUMO_DEFECTO = 'F';
	protected static final int PESO_DEFECTO = 5;
	
	protected static final String[] colores = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};
	protected static final char[] consumos = {'A', 'B', 'C', 'D', 'E', 'F'};
	
	public Electrodomestico(String color, char consumo, double precioBase, int peso) {
		
		if(colorValido(color)) {
			
			this.color = color;
		}
		
		else {
			
			this.color = COLOR_DEFECTO;
		}
		
		if(consumoValido(consumo)) {
			
			this.consumo = consumo;
		}
		
		else {
			
			this.consumo = CONSUMO_DEFECTO;
		}
		
		this.precioBase = precioBase;
		this.peso = peso;
	}
	
	public Electrodomestico() {
		
		this.color = COLOR_DEFECTO;
		this.consumo = CONSUMO_DEFECTO;
		this.precioBase = PRECIO_BASE_DEFECTO;
		this.peso = PESO_DEFECTO;
	}
	
	public Electrodomestico(double precioBase, int peso) {
		
		this.color = COLOR_DEFECTO;
		this.consumo = CONSUMO_DEFECTO;
		this.precioBase = precioBase;
		this.peso = peso;
	}
	
	private boolean colorValido(String color) {
		
		for(String c : colores) {
			
			if(c.equalsIgnoreCase(color)) {
				
				return true;
			}
		}
		
		return false;
	}
	
	private boolean consumoValido(char consumo) {
		
		for(char cons : consumos) {
			
			if(cons == consumo) {
				
				return true;
			}
		}
		
		return false;
	}
	
	public String getColor() {
		
		return color;
	}
	
	public char getConsumo() {
		
		return consumo;
	}
	
	public double getPrecioBase() {
		
		return precioBase;
	}
	
	public int getPeso() {
		
		return peso;
	}
	
	public void precioFinal() {
			
		if(consumo == 'A') {
				
			precioBase += 100; 
		}
			
		else if(consumo == 'B') {
				
			precioBase += 80; 
		}
			
		else if(consumo == 'C') {
			
			precioBase += 60; 
		}
			
		else if(consumo == 'D') {
			
			precioBase += 50; 
		}
			
		else if(consumo == 'E') {
			
			precioBase += 30; 
		}
			
		else if(consumo == 'F') {
			
			precioBase += 10; 
		}

		if(peso >= 0 && peso <= 19) {
			
			precioBase += 10;
		}
		
		else if(peso >= 20 && peso <= 49) {
			
			precioBase += 50;
		}
		
		else if(peso >= 50 && peso <= 79) {
			
			precioBase += 80;
		}
		
		else if(peso >= 80) {
			
			precioBase += 100;
		}
		
		System.out.println("El precio final es de " + precioBase + "€");
	}
	
	@Override
	public String toString() {
		
		return "- Color: " + color + "\n- Consumo: " + consumo + "\n- Peso: " + peso + "\n- Precio: " + precioBase + "€";
	}
}















