package actividad01;

import java.util.Arrays;
import java.util.Random;

public class Vector {
	
	private int[] v;
	private int posVacia;
	
	Random random = new Random();
	
	public Vector(int tamaño) {
		
		v = new int[tamaño];
		
		for(int i = 0; i < tamaño; i++) {
			
			v[i] = random.nextInt(21);
			
			posVacia++;
		}
		
	}
	
	void rellenar() {
		
		if(posVacia >= v.length) {
			
			System.out.println("El vector ya esta lleno, no se puede rellenar");
		}
		
		for(int i = 0; i < v.length; i++) {
			
			v[i] = random.nextInt(101);
			
			posVacia++;
		}
		
	}
	
	void vaciar() {
		
		posVacia = 0;
	}
	
	int numeroElementos() {
		
		return posVacia;
	}
	
	void visualizarVector() {
		
		for(int i = 0; i < posVacia; i++) {
			
			System.out.print("v[ " + i + " ] = " + v[i]);
		}
	}
	
	boolean estaCompleto() {
			
		if(posVacia >= v.length) {
			
			return true;
		}
		
		else {
			
			return false;
		}

	}
	
	boolean estaOrdenado() {
		
		if(posVacia <= 0) {
			
			System.out.println("El vector esta vacío");
		}
		
		for(int i = 0; i < posVacia - 1; i++) {
			
			if(v[i] > v[i + 1]) {
				
				return false;
			}
			
		}
		
		return true;
	}
	
	int buscar(int num) {
		
		boolean ordenado = estaOrdenado();
			
		for(int i = 0; i < posVacia; i++) {
				
			if(v[i] == num) {
					
				return i;
			}
				
			if (ordenado && v[i] > num) {
				
				return -1;
			}
		}
		
		return -1;
	}
	
	double media() {
		
		int suma = 0;
		
		for(int i = 0; i < posVacia; i++) {
			
			suma += v[i];
		}
		
		double resultado = suma / posVacia;
		
		return resultado;
	}
	
	int sumaIndicePar() {
		
		int suma = 0;
		
		for(int i = 0; i < posVacia; i++) {
			
			if(i % 2 == 0) {
				
				suma += v[i];
			}
		}
		
		return suma;
	}
	
	int sumaIndiceImpar() {
		
		int suma = 0;
		
		for(int i = 0; i < posVacia; i++) {
			
			if(i % 2 != 0) {
				
				suma += v[i];
			}
		}
		
		return suma;
	}
	
	int sumaPares() {
		
		int suma = 0;
		
		for(int i = 0; i < posVacia; i++) {
			
			if(v[i] % 2 == 0) {
				
				suma += v[i];
			}
		}
		
		return suma;
	}
	
	int sumaImpares() {
		
		int suma = 0;
		
		for(int i = 0; i < posVacia; i++) {
			
			if(v[i] % 2 != 0) {
				
				suma += v[i];
			}
		}
		
		return suma;
	}
	
	void invertir() {
		
		for(int i = 0; i < posVacia; i++) {
			
			int temp = v[i];
			
			v[i] = v[i] - v[posVacia - 1 - i];
			
			v[posVacia - 1 - i] = temp;
		}
	}
	
	boolean aniadir(int elemento) {
		
		if(posVacia >= v.length) {
			
			return false;
		}
		
		v[posVacia] = elemento;
		
		posVacia++;
		
		return true;
	}
	
	void eliminarUltimos(int numElementos) {
		
		posVacia -= numElementos;
		
		if(posVacia < 0) {
			
			posVacia = 0;
		}
	}
	
	boolean eliminar(int indice) {
		
		if(indice < 0 || indice >= posVacia) {
			
			return false;
		}
		
		else {
				
			for(int i = indice; i < posVacia - 1; i++) {
					
				v[i] = v[i + 1];
			}
				
			posVacia--;
				
			return true;
		}
	}
	
	int obtener(int indice) {
		
		if(indice < 0 || indice >= posVacia) {
			
			System.out.println("El índice escogido esta fuera de rango y no es válido");
			
			return Integer.MIN_VALUE;
		}
		
		else {
			
			return v[indice];
		}
	}
	
	int maximo() {
		
		if(posVacia <= 0) {
			
			System.out.println("El vector esta vacío");
			
			return Integer.MIN_VALUE;
		}
		
		else {
			
			int max = v[0];
			
			for(int i = 1; i < posVacia; i++) {
				
				if(v[i] > max) {
					
					max = v[i];
				}
			}
			
			return max;
		}
	}
	
	int minimo() {
		
		if(posVacia <= 0) {
			
			System.out.println("El vector esta vacío");
			
			return Integer.MAX_VALUE;
		}
		
		else {
			
			int min = v[0];
			
			for(int i = 1; i < posVacia; i++) {
				
				if(v[i] < min) {
					
					min = v[i];
				}
			}
			
			return min;
		}
	}
	
	void ordena() {
		
		Arrays.sort(v, 0, posVacia);
	}
}











