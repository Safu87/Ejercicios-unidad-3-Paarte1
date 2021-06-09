import java.util.*;

public class Ejercicio3{
	public static void main(String[] args) {
		int num;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el numero: ");
		num = scanner.nextInt();

		int doble = num * 2;
		int triple = num * 3;

		System.out.println("El doble del numero " + num + " es: " + doble);
		System.out.println("El triple del numero " + num + " es: " + triple);
	}
}