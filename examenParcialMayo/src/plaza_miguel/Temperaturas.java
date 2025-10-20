package plaza_miguel;

public class Temperaturas {
	private final double[][] temperaturas = {
			{25.5, 27.0, 26.5, 24.0, 23.5},
			{22.5, 21.0, 24.5, 26.0, 23.5},
			{18.0, 20.0, 21.5, 19.0, 18.5},
			{23.5, 22.0, 24.5, 25.0, 23.0},
			};
	
	private final String[] ciudades = {"Avil√©s", "Gij√≥n","Oviedo","Luarca" };
	
		
	double maxAviles = 23.5;
	double minAviles = 27.0;
	
	double maxGijon = 21.0;
	double minGijon = 26.0;
	
	double maxOviedo = 18.0;
	double minOviedo = 21.5;
	
	double maxLuarca = 22.0;
	double minLuarca = 25.0;
	
	double amplitudAviles = minAviles - maxAviles;
	double amplitudGijon = minGijon - maxGijon;
	double amplitudOviedo = minOviedo - maxOviedo;
	double amplitudLuarca = minLuarca - maxLuarca;
	
	double amplitudMax = 0;
	
	double amplitudes[] = {amplitudAviles, amplitudGijon, amplitudOviedo, amplitudLuarca};
	
	void MaxiMinima (){
		
		//Temperatura en Aviles
		
		for(int i = 0; i < 1; i++) {
			
			for(int j = 0; j < 5; j++) {
				
				if(temperaturas[i][j] > maxAviles) {
					
					maxAviles = temperaturas[i][j];
				}
			}
		}
		
		for(int i = 0; i < 1; i++) {
			
			for(int j = 0; j < 5; j++) {
				
				if(temperaturas[i][j] < minAviles) {
					
					minAviles = temperaturas[i][j];
				}
			}
		}
		
		System.out.println("La temperatura m·xima registrada en " + ciudades[0] + " es " + maxAviles);
		System.out.println("La temperatura mÌnima registrada en " + ciudades[0] + " es " + minAviles);
		
		//Temperatura en GijÛn
	
		for(int i = 0; i < 2; i++) {
			
			for(int j = 0; j < 5; j++) {
				
				if(temperaturas[i][j] > maxGijon) {
					
					maxGijon = temperaturas[i][j];
				}
			}
		}
		
		for(int i = 0; i < 2; i++) {
			
			for(int j = 0; j < 5; j++) {
				
				if(temperaturas[i][j] < minGijon) {
					
					minGijon = temperaturas[i][j];
				}
			}
		}
		
		System.out.println("La temperatura m·xima registrada en " + ciudades[1] + " es " + maxGijon);
		System.out.println("La temperatura mÌnima registrada en " + ciudades[1] + " es " + minGijon);
		
		//Temperatura en Oviedo

		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 5; j++) {
				
				if(temperaturas[i][j] > maxOviedo) {
					
					maxOviedo = temperaturas[i][j];
				}
			}
		}
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 5; j++) {
				
				if(temperaturas[i][j] < minOviedo) {
					
					minAviles = temperaturas[i][j];
				}
			}
		}
		
		System.out.println("La temperatura m·xima registrada en " + ciudades[2] + " es " + maxOviedo);
		System.out.println("La temperatura mÌnima registrada en " + ciudades[2] + " es " + minOviedo);
		
		//Temperatura en Luarca
		
		for(int i = 0; i < 4; i++) {
			
			for(int j = 0; j < 5; j++) {
				
				if(temperaturas[i][j] > maxLuarca) {
					
					maxLuarca = temperaturas[i][j];
				}
			}
		}
		
		for(int i = 0; i < 4; i++) {
			
			for(int j = 0; j < 5; j++) {
				
				if(temperaturas[i][j] < minLuarca) {
					
					minLuarca = temperaturas[i][j];
				}
			}
		}
		
		System.out.println("La temperatura m·xima registrada en " + ciudades[3] + " es " + maxLuarca);
		System.out.println("La temperatura mÌnima registrada en " + ciudades[3] + " es " + minLuarca);
		
	}
	
	void AmplitudTermica(){
		
		for(int i = 0; i < amplitudes.length; i++) {
			
			if(amplitudes[i] > amplitudMax) {
				
				amplitudMax = amplitudes[i];
				
				String nombreCiudad = ciudades[i];
			}
		}
		
		System.out.println("La ciudad con mayor amplitud tÈrmica es " + nombreCiudad + " con una amplitud de " + amplitudMax);
	}
}
