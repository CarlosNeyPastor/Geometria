package data;

public class Datos {
	
	private static Datos instancia;

	public static Datos getInstance() {
		
		if (instancia == null)
			instancia = new Datos();
		return (Datos) instancia;
		
	}
	
	public String nombre;

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;

	}
	
}
