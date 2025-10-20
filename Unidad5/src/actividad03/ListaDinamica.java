package actividad03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ListaDinamica {
	
	private ArrayList<Integer> lista;
	
	Random random = new Random();
	
	public ListaDinamica(int tamaño) {
		
		lista = new ArrayList<>(tamaño);
		
		for(int i = 0; i < tamaño; i++) {
			
			lista.add(random.nextInt(201));
		}
	}
	
	public int obtener(int indice) {
		
		if(indice >= lista.size() || indice < 0) {
			
			System.out.println("Índice fuera de rango");
			return Integer.MIN_VALUE;
		}
		
		else {
			
			return lista.get(indice);
		}
	}
	
	public void modificar(int indice, Integer nuevoValor) {
		
		if(indice >= lista.size() || indice < 0) {
			
			System.out.println("Índice fuera de rango");
		}
		
		else {
			
			lista.set(indice, nuevoValor);
			System.out.println("El valor en el índice " + indice + " ha sido modificado a " + nuevoValor);
		}
	}
	
	public void contenidoTradicional() {
		
		for(int i = 0; i < lista.size(); i++) {
			
			System.out.print(lista.get(i) + " ");
		}
		
		System.out.println();
	}
	
	public void contenidoRecomendable() {
		
		for(Integer valor : lista) {
			
			System.out.print(valor + " ");
		}
		
		System.out.println();
	}
	
	public void eliminar(int indice) {
		
		if(indice >= lista.size() || indice < 0) {
			
			System.out.println("Índice fuera de rango");
		}
		
		else {
			
			lista.remove(indice);
			System.out.println("El valor en el índice " + indice + " ha sido eliminado");
		}
	}
	
	public void eliminar(Integer valor) {
		
		if (lista.contains(valor)) {
			
			lista.remove(valor);
			System.out.println("El valor en el índice " + valor + " ha sido eliminado");
		}
		
		else {
			
			System.out.println("El valor " + valor + " no se encuentra en la lista.");
		}
	}
	
	public void insertar(Integer valor) {
		
		lista.addLast(valor);
	}
	
	public void insertar(int indice, Integer valor) {
		
		if(indice >= lista.size() || indice < 0) {
			
			System.out.println("Índice fuera de rango");
			lista.add(valor);
		}
		
		else {
			
			lista.add(indice, valor);
			System.out.println("El valor en el índice " + indice + " ha sido eliminado");
		}
	}
	
	public void copiar(ArrayList<Integer> lista2) {
		
		lista2.clear();
		
		for(Integer valor : lista) {
			
			lista2.add(valor);
		}
	}
	
	public void borrarTodos(Integer valor) {
		
		for (int i = 0; i < lista.size(); i++) {
			
	        if (lista.get(i).equals(valor)) {
	        	
	            lista.remove(i);
	            i--;
	        }
	    }
	    
	    System.out.println("Todos los elementos con el valor " + valor + " han sido eliminados.");
	}
	
	public void ordenar() {
		
		Collections.sort(lista);
	}

}







