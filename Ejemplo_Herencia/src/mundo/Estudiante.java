package mundo;

public class Estudiante extends Persona {
	private String codigo;
	private String email;
	private String carrera;
	
	public Estudiante(String nombre, int cedula, String codigo, String email, String carrera) {
		
		super(nombre, cedula);
		this.codigo = codigo;
		this.email = email;
		this.carrera = carrera;
	}

}
