package preguntayrespuesta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class preguntarespuesta
{
	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	 
	public static void main(String[] args) throws IOException {
		System.out.println("¿Cómo te llamas?");
		String nombrea = entrada.readLine();
		System.out.println("¿Cuántos años tienes?");
		String edad = entrada.readLine();
		System.out.println("¿En qué curso estás?");
		String curso = entrada.readLine();
		mensaje(nombrea, edad, curso);
	}
 
	public static void mensaje(String nombre, String edad, String curso) {
		System.out.println("Te llamas " + nombre + ", tienes " + edad + " años y estás en " + curso);
	}
}
+