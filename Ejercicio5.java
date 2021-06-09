import java.util.*;

public class Ejercicio5{
	public static void main(String[] args) {
		int num;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el numero: ");
		num = scanner.nextInt();

		int result = num + 1;

		System.out.println("El numero siguiente es: " + result);
	}
}