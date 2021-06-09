import java.util.*;

public class Ejercicio9{
	public static void main(String[] args) {
		String wordA, wordB;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese la primera palabra: ");
		wordA = scanner.nextLine();
		System.out.println("Ingrese la segunda palabra: ");
		wordB = scanner.nextLine();

		String changeA = wordB, changeB = wordA;

		System.out.println("La primera palabra ahora es: " + changeA);
		System.out.println("La segunda palabra ahora es: " + changeB);

	}
}