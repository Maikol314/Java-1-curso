package Plaza_Miguel;

public class AppRectangulo {

	public static void main(String[] args) {
		Rectangulo r = new Rectangulo(10,3);
		System.out.println("Con for");
		r.dibujaConFor();
		System.out.println("Con while");
		r.dibujaConWhile();
		System.out.println("Con Do While");
		r.dibujaConDoWhile();
	}
}
