package actividad06;

public class AppCuentaCorriente2 {

	public static void main(String[] args) {
		
		CuentaCorriente2 ana = new CuentaCorriente2("75315698C", "Ana", 1000);
		CuentaCorriente2 pepe = new CuentaCorriente2("09361288Z", "Pepe");
		
		Gestor manolo = new Gestor("Manolo", "627963111");
		
		CuentaCorriente2.setNombreBanco("Banco QueTQuito");
		
		ana.mostrarInfo();
		System.out.println();
		pepe.mostrarInfo();
		
		CuentaCorriente2.setNombreBanco("Banco Aun+Malo");
		
		ana.mostrarInfo();
		System.out.println();
		pepe.mostrarInfo();
		
		ana.gestor = manolo;
		ana.mostrarInfo();

	}

}
