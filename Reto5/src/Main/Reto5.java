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
	List<Empleado> lista=new ArrayList<Empleado>();
	for (int i = 1; i < 21; i++) {
		Empleado empleado=new Empleado("nombre"+i,r.nextInt(1,21),r.nextDouble(1.00,2000.00));
		lista.add(empleado);
	}
	for(int i=1;i<6;i++) {
		Tienda tienda =new Tienda(i,"tienda"+i,lista.get(r.nextInt(1,21)));
		tienda.anadirProducto(Util.Funciones.dimeEntero("Introduzca el numero de productos", sc), r);
	}
	Cliente cliente=new Cliente();
	
	}

}
