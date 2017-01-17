import interfaces.Validation;

public class Customer implements Validation {
	private int edad;
	private String nombre;
	private String cedula;
	
	public Boolean isAdult() {
		// TODO Auto-generated method stub
		if (this.edad <= 18){
			System.out.println(edad);
			return false;
		}else{
			System.out.println(edad);
			return true;
		}
	}

	public int getEdad() {
		System.out.println(edad);
		return edad;
	}

	public void setEdad(int edad) {
		System.out.println(edad);
		this.edad = edad;
	}

	public String getNombre() {
		System.out.println(edad);
		System.out.println(edad);
		return nombre;
	}

	public void setNombre(String nombre) {
		System.out.println(edad);
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
