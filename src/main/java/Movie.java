
public class Movie {
	private String nombre;
	private Boolean estado;
	public Movie(String nombre, Boolean estado) {
		super();
		this.nombre = nombre;
		this.estado = estado;
	}
	public boolean isRentableTo(Customer customer){
		return customer.isAdult();
	}
	
}
