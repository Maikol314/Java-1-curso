package actividad02;

public class AppTabla {

	public static void main(String[] args) {
		
		Tabla matriz = new Tabla(5, 5);
		
		matriz.rellenar();
		matriz.visualizarTabla();
		System.out.println(matriz.buscar(19));
		System.out.println(matriz.media());
		System.out.println(matriz.obtener(3, 4));
	}

}
