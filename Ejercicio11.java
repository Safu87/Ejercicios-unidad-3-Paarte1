import java.util.*;

public class Ejercicio11{
	public static void main(String[] args) {
		double cm;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese un valor en centimetros: ");
		cm = scanner.nextDouble();	

		double yd = cm*(1/1.44);
		double mts = cm*(1/100);
		double pies = cm*(1/30.48);
		double pl = cm*(1/2.54);

		System.out.println("Valor en yardas: " + yd);
		System.out.println("Valor en metros: " + mts);
		System.out.println("Valor en pies: " + pies);
		System.out.println("Valor en pulgadas: " + pl);

	}
}