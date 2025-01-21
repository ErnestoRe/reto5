package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Clases.Cliente;
import Clases.Empleado;
import Clases.Tienda;

public class Reto5 {

	public static void main(String[] args) {
	Random r=new Random();
	Scanner sc=new Scanner(System.in);
	List<Empleado> listaEmpleado=new ArrayList<Empleado>();
	List<Tienda> listaTienda=new ArrayList<Tienda>();
	for (int i = 1; i < 21; i++) {
		Empleado empleado=new Empleado("nombre"+i,r.nextInt(1,21),r.nextDouble(1.00,2000.00));
		listaEmpleado.add(empleado);
	}
	for(int i=1;i<6;i++) {
		Tienda tienda =new Tienda(i,"tienda"+i,listaEmpleado.get(r.nextInt(0,20)));
		tienda.anadirProducto(Util.Funciones.dimeEntero("Introduzca el numero de productos", sc), r);
		listaTienda.add(tienda);
	}
	Cliente cliente=new Cliente();
	
	int opcion=6;
	do {
		System.out.println("1.Ver tiendas");
		System.out.println("2.Comprar");
		System.out.println("3.Mostrar compras");
		System.out.println("4.Realizar una queja");
		System.out.println("5.Salir");
		opcion=Util.Funciones.dimeEntero("Elige una opcion", sc);
		if(opcion==5) {
			break;
		}
		if(opcion==1) {
			verTiendas(listaTienda);
		}
		if(opcion==2) {
			verTiendas(listaTienda);
			
		}
		if(opcion==3) {
			break;
		}
		if(opcion==4) {
			break;
		}
	}while(true);
	
	}
	
	public static  void verTiendas(List<Tienda> listaTienda) {
		for (int i = 0; i < listaTienda.size(); i++) {
			
			System.out.println(listaTienda.get(i).toString());  
		}
	}


}
