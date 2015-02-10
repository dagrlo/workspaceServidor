package edu.uv.dawts.tienda;

public class CD implements Comprable {
	private double precio;
	private String descripcion;
	private double id;
	
	public CD(){}
	
	

	public CD(double precio, String descripcion, double id) {
		super();
		this.precio = precio;
		this.descripcion = descripcion;
		this.id = id;
	}



	@Override
	public double getPrecio() {
		
		return this.precio;
	}

	@Override
	public String getDescripcion() {
		
		return this.descripcion;
	}

	@Override
	public int getID() {
		
		return (int) this.id;
	}

}
