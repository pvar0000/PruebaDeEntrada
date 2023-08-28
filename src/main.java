import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<>();
		System.out.println("Registre 3 personas:");
		for (int i = 0; i < 3; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Persona " + (i + 1) + ":");
			System.out.print("Nombre: ");
			String nombre = sc.nextLine();
			System.out.print("Edad: ");
			Integer edad = sc.nextInt();
			sc.nextLine();
			System.out.print("Género: ");
			String genero = sc.nextLine();
			Persona persona = new Persona(nombre, edad, genero);
			personas.add(persona);
		}
		
		Persona.calcularEdadPromedio(personas);
	}
}
