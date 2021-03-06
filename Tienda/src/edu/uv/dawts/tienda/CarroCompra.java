package edu.uv.dawts.tienda;

import java.util.ArrayList;
import java.util.List;

public class CarroCompra<T extends Comprable> {
	//almacena cosas comprables
	
	private ArrayList<T> carro;
	
	public CarroCompra(){
		carro=new ArrayList<T>();
	}
	
	public void add(T producto){
		carro.add(producto);
	}
	
	public List<T> getCarro(){
		return carro;
	}
	
	public double getTotalCarro(){
		double precio=0;
		
		for (T producto:carro){
			precio=precio+producto.getPrecio();
		}
		
		return precio;
	}
	
	
	
}
