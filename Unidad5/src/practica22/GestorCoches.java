package practica22;

import java.util.ArrayList;

public class GestorCoches {
	
	private ArrayList<Coche> coches = new ArrayList<>();
	
	public void añadirCoche(String matricula, String marca, String modelo, int km) {
		
		coches.add(new Coche(matricula, marca, modelo, km));
	}
	
	public void mostrarCoches() {
		
		for(Coche c : coches) {
			
			System.out.print(c);
			System.out.println();
		}
	}
	
	public void mostrarMarca(String marca) {
		
		for(Coche c : coches) {
			
			if(c.getMarca().equalsIgnoreCase(marca)) {
				
				System.out.print(c);
				System.out.println();
			}
		}
	}
	
	public void mostrarMenosDeKm(int km) {
		
		for(Coche c : coches) {
			
			if(c.getKm() < km) {
				
				System.out.print(c);
				System.out.println();
			}
		}
	}
	
	public void mostrarKmMax() {
		
		Coche max = coches.get(0);
		
		for(Coche c : coches) {
			
			if(c.getKm() > max.getKm()) {
				
				max = c;
			}
		}
	}

}
