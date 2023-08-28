import java.util.ArrayList;

public class Persona {
	private String nombre;
	private Integer edad;
	private String genero;
	
	public Persona(String nombre, Integer edad, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}
	
	public String obtenerNombre() {
		return this.nombre;
	}
	
	public Integer obtenerEdad() {
		return this.edad;
	}
	
	public void setearNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setearEdad(Integer edad) {
		this.edad = edad;
	}
	
	public static void calcularEdadPromedio(ArrayList<Persona> personas) {
		Integer sumaEdades = 0;
		for (Persona persona : personas) {
			sumaEdades += persona.obtenerEdad();
		}
		System.out.println("Edad promedio: " + sumaEdades / personas.size());
	}
}
