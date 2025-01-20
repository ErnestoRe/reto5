package Clases;

import java.util.List;

public class Tienda {
	
	private int id_tienda;
	private String nombre;
	private Empleado gerente;
	private static List<Producto> lista;
	public Tienda() {
		super();
	}
	public Tienda(int id_tienda, String nombre, Empleado gerente, List<Producto> productos) {
		super();
		this.id_tienda = id_tienda;
		this.nombre = nombre;
		this.gerente = gerente;
		this.lista = productos;
	}
	public int getId_tienda() {
		return id_tienda;
	}
	public void setId_tienda(int id_tienda) {
		this.id_tienda = id_tienda;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Empleado getGerente() {
		return gerente;
	}
	public void setGerente(Empleado gerente) {
		this.gerente = gerente;
	}
	public List<Producto> getProductos() {
		return lista;
	}
	public void setProductos(List<Producto> productos) {
		this.lista = productos;
	}
	
	public static void anadirProducto(Producto producto){
		lista.add(producto);
	}
	
}
