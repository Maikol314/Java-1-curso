package actividad03;

public class AppMatesXY {

	public static void main(String[] args) {
		
		System.out.println("Valor actual de x = " + MatesXY.x);
		System.out.println("Valor actual de y = " + MatesXY.y);
		
		MatesXY.x = 1;
		MatesXY.y = 2;
		
		MatesXY.intercambiar();
		MatesXY.sumar();	
		MatesXY.restar();
		MatesXY.multiplicar();
		MatesXY.divEntera();
		MatesXY.resDivEntera();
		MatesXY.abs();
		MatesXY.mayor();
		
	}
	

}
