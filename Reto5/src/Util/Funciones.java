package Util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.ArrayList;

public class Funciones {
	public static boolean esInt(String s) {
		try {
			int n=Integer.parseInt(s);
			return true;
		}catch(Exception ex) {
			return false;
		}
	}
	
	public static boolean esDouble(String s) {
		try {
			double d=Double.parseDouble(s);
			return true;
		}catch(Exception ex) {
			return false;
		}
	}
	
	public static int dimeEntero(String texto, Scanner sc) {
		do {
			try {
				System.out.println(texto);
				String s1=sc.nextLine();
				int num=Integer.parseInt(s1);
				return num;
			}catch(Exception ex) {
				System.out.println("Introduce un formato valido");
			}
		}while(true);
	}
	
	public static double dimeDouble(String texto, Scanner sc) {
		do {
			try {
				System.out.println(texto);
				String s=sc.nextLine();
				double num=Double.parseDouble(s);
				return num;
			}catch(Exception ex) {
				System.out.println("Introduce un formato valido");
			}
		}while(true);
	}
	
	public static LocalDate dimeFecha(String texto, Scanner sc) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		do {
			try {
				System.out.println(texto);
				String textoFecha = sc.nextLine();
				LocalDate fecha = LocalDate.parse(textoFecha, formato);
				return fecha;
			} catch (Exception ex) {
				System.out.println("Fecha no valida");
			}
		} while (true);
	}
	
	public static boolean esPrimo(int num) {
		int contadorp=0;
		for(int i=num; i>1; i--) {
			if(num%i!=0) {
				contadorp++;
			}else {
				contadorp=0;
			}
		}
		if(contadorp!=0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void muestraListaInt(List<Integer> lista) {
		for (int i = 0; i < lista.size(); i++) {
			System.out.print(i == 0 ? lista.get(i) : ", " + lista.get(i));
		}
		System.out.println();
	}
	
	public static double redondea(double d) {
		return Math.round(d*100)/(double)100;
	}
}
