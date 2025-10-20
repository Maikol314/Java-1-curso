package actividad02;

import java.util.Random;

public class Tabla {
	
	private int[][] t;
	
	Random random = new Random();
	
	public Tabla(int filas, int columnas) {
		
		t = new int[filas][columnas];
		
		for(int i = 0; i < filas; i++) {
			
			for(int j = 0; j < columnas; j++) {
				
				t[i][j] = random.nextInt(101);
			}
		}
		
	}
	
	public void rellenar() {
		
		for(int i = 0; i < t.length; i++) {
			
			for(int j = 0; j < t[i].length; j++) {
				
				t[i][j] = random.nextInt(101);
			}
		}
	}
	
	public void visualizarTabla() {
		
		for(int i = 0; i < t.length; i++) {
			
			for(int j = 0; j < t[i].length; j++) {
				
				System.out.print("t[" + i + "][" + j + "]=" + t[i][j] + ", ");
			}
			
			System.out.println();
		}
	}
	
	public boolean buscar(int numero) {
		
		for(int i = 0; i < t.length; i++) {
			
			for(int j = 0; j < t[i].length; j++) {
				
				if(numero == t[i][j]) {
					
					return true;
				}
				
			}
		}
		
		return false;
	}
	
	public double media() {
		
		int total = 0;
		int totalNumeros = t.length * t[0].length;
		
		for(int i = 0; i < t.length; i++) {
			
			for(int j = 0; j < t[i].length; j++) {
				
				total += t[i][j]; 
			}
		}
		
		return (double) total / totalNumeros;
	}
	
	public int obtener(int fila, int columna) {
		
		if(fila >= 0 && fila < t.length && columna >= 0 && columna < t[0].length) {
			
			return t[fila][columna];
		}
		
		else {
			
			System.out.println("Índice fuera de rango");
			return Integer.MIN_VALUE;
		}
	}

}











