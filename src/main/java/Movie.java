
public class Movie {
	private String titulo;
	private String genero;
	private String categoria;
	private String rating;
	private String novel;
	public Movie(String titulo, String genero, String categoria) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.categoria = categoria;
	}
	public boolean isRentableTo(Customer customer){
		if (this.categoria.equals("R")){
			return customer.isAdult();	
		}else{
			return true;
		}
		
	}
}
