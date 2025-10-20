package actividad06;

public class EContratado extends Empleado {
	
	private float salario;
	
	public EContratado(String dni, String nombre, String apellidos, int anioIngreso, float salario) {
		
		super(dni, nombre, apellidos, anioIngreso);
		this.salario = salario;
	}
	
	public void setSalarioBase(float salarioBase) {
		
		this.salario = salario;
	}
	
	public float getSalarioBase() {
		
		return salario;
	}
	
	@Override
	public float getSalario() {
		
		int aniosAntiguedad = 2025 - getAnioIngreso();
		
		float salarioAjustado = salario;
		
        if (aniosAntiguedad == 1) {
        	
            salarioAjustado *= 1.01;
        } 
        
        else if (aniosAntiguedad == 2) {
        	
            salarioAjustado *= 1.02;
        } 
        
        else if (aniosAntiguedad == 3) {
        	
            salarioAjustado *= 1.05;
        } 
        
        else if (aniosAntiguedad == 4) {
        	
            salarioAjustado *= 1.06;
        } 
        
        else if (aniosAntiguedad == 5) {
        	
            salarioAjustado *= 1.07;
        } 
        
        else if (aniosAntiguedad == 6) {
        	
            salarioAjustado *= 1.08;
        } 
        
        else if (aniosAntiguedad == 7) {
        	
            salarioAjustado *= 1.10;
        } 
        
        else if (aniosAntiguedad == 8) {
        	
            salarioAjustado *= 1.11;
        } 
        
        else if (aniosAntiguedad == 9) {
        	
            salarioAjustado *= 1.12;
        } 
        
        else if (aniosAntiguedad == 10) {
        	
            salarioAjustado *= 1.13;
        } 
        
        else if (aniosAntiguedad == 11) {
        	
            salarioAjustado *= 1.14;
        } 
        
        else if (aniosAntiguedad == 12) {
        	
            salarioAjustado *= 1.15;
        } 
        
        else {
        	
            salarioAjustado *= 1.20;
        }
        
        return salarioAjustado;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "\n- Salario: " + this.getSalario();
	}

}
