import java.util.*;

public class Ejercicio8{
	public static void main(String[] args) {
		float num1, num2, num3;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el primer numero: ");
		num1 = scanner.nextFloat();
		System.out.println("Ingrese el segundo numero: ");
		num2 = scanner.nextFloat();
		System.out.println("Ingrese el tercer numero: ");
		num3 = scanner.nextFloat();

		System.out.println("El promedio es: " + ((num1 + num2 + num3)/3));
	}
}