import java.util.*;

public class Ejercicio7{
	public static void main(String[] args) {
		int min = 10, max = 50;

		Random random = new Random();

		int value = random.nextInt(max + min) + min;
		System.out.println("El numero aleatorio es: " + value);
		System.out.println("El numero aleatorio disminuido en 15% es: " + (value - ((value * 15)/100)));
	}
}