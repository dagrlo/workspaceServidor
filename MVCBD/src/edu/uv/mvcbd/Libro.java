package edu.uv.mvcbd;

public class Libro {
	private String id;
	private String titulo;
	private double precio;
	
	public Libro(){}		
	
	public Libro(String id, String titulo, double precio) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.precio = precio;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
