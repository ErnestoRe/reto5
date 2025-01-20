package Clases;

public class Empleado {
	private String nombre;
	private int antiguedad;
	private double sueldo;
	public Empleado(String nombre, int antiguedad, double sueldo) {
		super();
		this.nombre = nombre;
		this.antiguedad = antiguedad;
	}
	public Empleado() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", antiguedad=" + antiguedad + ", sueldo=" + sueldo + "]";
	}
	
	public double sueldoFinal() {
		if(antiguedad<5) {
			return sueldo=1000;
		}
		else if(antiguedad>=6 && antiguedad<=10) {
			return sueldo=1200;
		}
		else {
			return sueldo=1500;
		}
	}
}
