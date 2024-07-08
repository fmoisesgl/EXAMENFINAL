package Arreglo;

public class Ingeniero {
	private String nombre;
	
	private int edad;
    private double tarifa;
	private int horastrabajo;
	

	public Ingeniero(String nombre, int edad, double tarifa, int horastrabajo) {
		this.nombre = nombre;
		this.edad = edad;
		this.tarifa = tarifa;
		this.horastrabajo = horastrabajo;
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public double getTarifa() {
		return tarifa;
	}

	public int gethorastrabajo() {
		return horastrabajo;
	}
	
	
	
}
