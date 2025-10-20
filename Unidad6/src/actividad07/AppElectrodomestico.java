package actividad07;

import java.util.ArrayList;

public class AppElectrodomestico {

	public static void main(String[] args) {
		
		Electrodomestico[] electrodomesticos = new Electrodomestico[10];
		
		electrodomesticos[0] = new Electrodomestico("Negro", 'B', 850, 100);
		electrodomesticos[1] = new Electrodomestico("Blanco", 'B', 850, 120);
		electrodomesticos[2] = new Lavadora("Negro", 'B', 850.0, 100, 50);
		electrodomesticos[3] = new Television("Azul", 'B', 850, 100, 45, true);
		electrodomesticos[4] = new Electrodomestico("Gris", 'A', 800, 80);
		electrodomesticos[5] = new Lavadora(700, 150);
		electrodomesticos[6] = new Electrodomestico(1050, 250);
		electrodomesticos[7] = new Electrodomestico();
		electrodomesticos[8] = new Lavadora();
		electrodomesticos[9] = new Television();
		
		for(int i = 0; i < electrodomesticos.length; i++) {
			
			if(electrodomesticos[i] != null) {
				
				electrodomesticos[i].precioFinal();
			}
		}

	}

}
