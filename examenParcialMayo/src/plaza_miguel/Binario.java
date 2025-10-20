package plaza_miguel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Binario {
	
	public static void main(String[] args) {
		BufferedReader b = null;
		int decimal;
				
		try {
			b = new BufferedReader(new FileReader("E:\\ProgAbril2025\\binario.txt"));
			String linea = b.readLine();
			
			// Mientras no lleguemos al final del archivo
			while (linea!=null) {
				decimal=0; 
				// Completar el código aquí
				// 100 = 4   [(101)₂ = (0×2^0) + (0×2^1) + (1×2^2)]
				
				
				System.out.println(linea+" (binario) = "+decimal+ " (decimal)");
				// Leer línea siguiente 
				
			}
		} catch (IOException ex) {
			System.out.println (ex.getMessage());
		} finally { // en cualquier caso cerramos el flujo
			if (b!=null) {  // si el flujo está abierto
				try {
					b.close();
				} catch(IOException ex) {
					System.out.println(ex);
				}
			}
		}
	}
}
