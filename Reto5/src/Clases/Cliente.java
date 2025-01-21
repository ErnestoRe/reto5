package Clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cliente {

	private String nombre;
	private HashMap<Tienda, List<Producto>> compras;

	public Cliente() {
		this.compras = new HashMap<Tienda, List<Producto>>();
	}

	public Cliente(String nombre) {
		super();
		this.nombre = nombre;
		this.compras = new HashMap<Tienda, List<Producto>>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashMap<Tienda, List<Producto>> getCompras() {
		return compras;
	}

	public void setCompras(HashMap<Tienda, List<Producto>> hashmap) {
		this.compras = hashmap;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", hashmap=" + compras + "]";
	}

	public void comprarProducto(Tienda tienda, Producto producto) {
		compras.put(tienda, new ArrayList<>());
		compras.get(tienda).add(producto);
	}

	public double gastoTotal() {
		double total = 0;
		for (List<Producto> productos : compras.values()) {
			for (Producto producto : productos) {
				total += producto.getPrecio();
			}
		}
		return total;
	} 

}
