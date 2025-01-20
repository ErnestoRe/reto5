package Clases;

public class Empleado {
	private String nombre;
	private int antiguedad;
	private double sueldo;
	public Empleado(String nombre, int antiguedad, double sueldo) {
		super();
		this.nombre = nombre;
		this.antiguedad = antiguedad;
		this.sueldo = sueldo;
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
}
