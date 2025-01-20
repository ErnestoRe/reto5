package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Clases.Empleado;
import Clases.Tienda;

public class Reto5 {

	public static void main(String[] args) {
	Random r=new Random();
	List<Empleado> lista=new ArrayList<Empleado>();
	for (int i = 1; i < 21; i++) {
		Empleado empleado=new Empleado("nombre"+i,r.nextInt(1,21),r.nextDouble(1.00,2000.00));
	}
	for(int i=1;i<6;i++) {
		Tienda tienda =new Tienda(i,"tienda"+i,lista.get(r.nextInt(1,21)));
		tienda.setProductos(null);
	}

	}

}
