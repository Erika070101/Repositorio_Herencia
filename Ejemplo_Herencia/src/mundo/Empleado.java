package mundo;

public class Empleado extends Persona{
	protected String cargo;
	protected double sueldo;
	
	
	public Empleado(String nombre, int cedula, String cargo, double sueldo) {
		super(nombre, cedula);
		this.cargo = cargo;
		this.sueldo = sueldo;
	}

}
