package Clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tienda {
	
	private  int id_tienda;
	private  String nombre;
	private  Empleado gerente;
	private  List<Producto> lista;
	public Tienda() {
		super();
		lista=new ArrayList<Producto>();

	}
	public Tienda(int id_tienda, String nombre, Empleado gerente) {
		super();
		this.id_tienda = id_tienda;
		this.nombre = nombre;
		this.gerente = gerente;
		lista=new ArrayList<Producto>();
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
	
	public  void anadirProducto(int veces, Random r){
		Producto producto=new Producto();
		int numpro=0;
		for (int i = 0; i < veces+1; i++) {
			numpro=i;
			producto=new Producto(r.nextInt(1,veces+1),"producto"+numpro,r.nextDouble(1000.00,2001.00));
			lista.add(producto);
			
		}
		if(veces<5) {
			for (int j = 0; j <5; j++) {
				producto=new Producto(r.nextInt(1,veces+1),"producto"+numpro+j,r.nextDouble(1000.00,2001.00));
				lista.add(producto);
			}
		}
		
	}
	public  void quitarProducto(Producto producto,Random r) {
		lista.remove(producto);
		if(lista.size()<5) {
			anadirProducto(0,r);
		}
	}
	public String toString() {
		return "Tienda [id_tienda=" + id_tienda + ", nombre=" + nombre + ", gerente=" + gerente + "]";
	}
	
	
}
