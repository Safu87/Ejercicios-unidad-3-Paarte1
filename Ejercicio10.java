import java.util.*;

public class Ejercicio10{
	public static void main(String[] args) {
		int base, altura;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese la base del rectangulo: ");
		base = scanner.nextInt();	
		System.out.println("Ingrese la altura del rectangulo: ");
		altura = scanner.nextInt();

		System.out.println("El Area del rectangulo es : " + base * altura);	
		System.out.println("El Perimetro del rectangulo es : " + ((2*base)+(2*altura)));
	}
}