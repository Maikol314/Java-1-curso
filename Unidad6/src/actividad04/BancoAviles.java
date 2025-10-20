package actividad04;

public class BancoAviles {

	public static void main(String[] args) {
		
		Titular titular1 = new Titular("Noe", "Tira Donada", 39);
		
		CuentaCorriente ctaTitular1 = new CuentaCorriente(titular1, "000001");
		
		ctaTitular1.ingreso(1000);
		ctaTitular1.reintegro(300);
		
		System.out.println(ctaTitular1);
		
		CuentaAhorro ctaAhorro1 = new CuentaAhorro(titular1, "000002", 0, 2.5);
		
		ctaAhorro1.ingreso(3000);
		titular1.getNombre();
		titular1.getApellidos();
		ctaAhorro1.getNumCta();
		ctaAhorro1.getSaldo();
		System.out.println("Intereses generados: " + ctaAhorro1.calcularInteres() + "€");
		System.out.println(ctaAhorro1.toString());

	}

}
