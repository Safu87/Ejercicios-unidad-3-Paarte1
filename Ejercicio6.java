import java.util.*;
import java.util.Random;

public class Ejercicio6{
	public static void main(String[] args) {
		int min = 0, max = 200;

		Random random = new Random();

		int value = random.nextInt(max + min) + min;
		System.out.println("El numero aleatorio es: " + value);
		System.out.println("El numero aleatorio aumentado en 30% es: " + (value + ((value * 30)/100)));	

	}
}