import interfaces.Validation;

public class Customer implements Validation {
	private int edad;
	private String nombre;
	private String cedula;
	
	public Boolean isAdult() {
		// TODO Auto-generated method stub
		if (this.edad <= 18){
			return false;
		}else{
			return true;
		}
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public Customer(int edad, String nombre, String cedula) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.cedula = cedula;
	}
	
	
}
