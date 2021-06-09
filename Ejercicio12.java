import java.util.*;

public class Ejercicio12{
	public static void main(String[] args) {
		double cel;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese grados Celsius: ");
		cel = scanner.nextDouble();	

		double far = (cel * 1.8) + 32;

		System.out.println("Los grados Fahrenheit son: " + far);
		
	}
}