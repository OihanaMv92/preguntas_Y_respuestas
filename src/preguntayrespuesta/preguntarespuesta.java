package preguntayrespuesta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class preguntarespuesta
{
	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	 
	public static void main(String[] args) throws IOException {
		System.out.println("�C�mo te llamas?");
		String nombrea = entrada.readLine();
		System.out.println("�Cu�ntos a�os tienes?");
		String edad = entrada.readLine();
		System.out.println("�En qu� curso est�s?");
		String curso = entrada.readLine();
		mensaje(nombrea, edad, curso);
	}
 
	public static void mensaje(String nombre, String edad, String curso) {
		System.out.println("Te llamas " + nombre + ", tienes " + edad + " a�os y est�s en " + curso);
	}
}
+