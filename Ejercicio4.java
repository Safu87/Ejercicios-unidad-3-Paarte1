import java.util.*;

public class Ejercicio4{
	public static void main(String[] args) {
		int num;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el numero: ");
		num = scanner.nextInt();

		int cuadrado = num * num;
		int cubo = num * num * num;

		System.out.println("El cuadrado del numero " + num + " es: " + cuadrado);
		System.out.println("El cubo del numero " + num + " es: " + cubo);
	}
}