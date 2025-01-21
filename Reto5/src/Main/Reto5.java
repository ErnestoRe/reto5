package Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Clases.Cliente;
import Clases.Empleado;
import Clases.Producto;
import Clases.Tienda;

public class Reto5 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		List<Empleado> listaEmpleado = new ArrayList<Empleado>();
		List<Tienda> listaTienda = new ArrayList<Tienda>();
		for (int i = 1; i < 21; i++) {
			Empleado empleado = new Empleado("nombre" + i, r.nextInt(1, 21), r.nextDouble(1.00, 2000.00));
			listaEmpleado.add(empleado);
		}
		for (int i = 1; i < 6; i++) {
			Tienda tienda = new Tienda(i, "tienda" + i, listaEmpleado.get(r.nextInt(0, 20)));
			tienda.anadirProducto(Util.Funciones.dimeEntero("Introduzca el numero de productos", sc), r);
			listaTienda.add(tienda);
		}
		Cliente cliente = new Cliente("cliente1");

		int opcion = 6;
		do {
			System.out.println("1.Ver tiendas");
			System.out.println("2.Comprar");
			System.out.println("3.Mostrar compras");
			System.out.println("4.Realizar una queja");
			System.out.println("5.Salir");
			opcion = Util.Funciones.dimeEntero("Elige una opcion", sc);
			if (opcion == 5) {
				break;
			}
			if (opcion == 1) {
				verTiendas(listaTienda);
			}
			if (opcion == 2) {
				comprar(sc, listaTienda, cliente, r);
				
			}
			if (opcion == 3) {
				mostrarCompras(cliente, listaTienda);
			}
			if (opcion == 4) {
				queja(sc,listaTienda,r,listaEmpleado);
			}
		} while (true);

	}

	public static void verTiendas(List<Tienda> listaTienda) {
		for (int i = 0; i < listaTienda.size(); i++) {

			System.out.println(listaTienda.get(i).toString());
		}
	}

	public static void comprar(Scanner sc, List<Tienda> listaTienda, Cliente cliente, Random r) {
		Tienda tienda = pedirTienda(sc, listaTienda, r);
		Producto producto = tienda.getProductos().get(r.nextInt(0, tienda.getProductos().size()));
		System.out.println("Has comprado "+ producto);
		tienda.quitarProducto(producto, r);
		cliente.comprarProducto(tienda, producto);
	}

	public static Tienda pedirTienda(Scanner sc, List<Tienda> listaTienda, Random r) {
		verTiendas(listaTienda);
		do {
			int eleccion = Util.Funciones.dimeEntero("Elige una tienda", sc);
			for (int i = 0; i < listaTienda.size(); i++) {
				if (eleccion == listaTienda.get(i).getId_tienda()) {
					return listaTienda.get(i);
				}
			}
		} while (true);

	}
	
	public static void mostrarCompras(Cliente cliente, List<Tienda> listaTienda) {
		HashMap<Tienda, List<Producto>> compras = cliente.getCompras();
		for (int i = 0; i < compras.size();i++) {
			compras.get(listaTienda.get(i));
		}
		System.out.println(cliente.toString());
	}
 
	public static void queja(Scanner sc, List<Tienda> listaTienda, Random r, List<Empleado> listaEmpleado) {
		Tienda t1 = Reto5.pedirTienda(sc, listaTienda, r);
		t1.setGerente(listaEmpleado.get(r.nextInt(0, listaEmpleado.size())));
		System.out.println("Ha realizado una queja sobre "+t1);

	}

}
