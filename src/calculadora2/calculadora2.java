package calculadora2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class calculadora2 {

	static int num1, num2;
	static char opc;
	static boolean salir = false;
	static char sal = 'N';

	public static void hola() {

		System.out.println("hacer operacion matematicas: ");

	}

	public static void ingresarnumeros() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("ingrese el primer numero: ");
		num1 = entrada.nextInt();

		System.out.println("ingrese el segundo numero: ");
		num2 = entrada.nextInt();

	}

	public static int sumar(int a, int b) {

		int suma = a + b;
		return suma;

	}

	public static int resta(int a, int b) {

		int resto = a - b;
		return resto;

	}

	public static int multiplicacion(int a, int b) {

		int multiplicar = a * b;
		return multiplicar;

	}

	public static float division(float a, float b) {

		float divisor = a / b;

		return divisor;

	}

	public static void seguirOno() {
		Scanner datos = new Scanner(System.in);
		System.out.println("Desea continuar con el programa?(elegir S o N)");
		sal = datos.next().charAt(0);

		if (sal == 'S' || sal == 's') {
			salir = false;
		}
		if (sal == 'N' || sal == 'n') {
			salir = true;
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		hola();
		seguirOno();
		System.out.println("1- suma");
		System.out.println("2- resta");
		System.out.println("3- multiplicacion");
		System.out.println("4- division");
		System.out.println("que operacion desea realizar?");
		opc = entrada.next().charAt(0);
		try {
			switch (opc) {

			case '1':
				ingresarnumeros();
				sumar(num1, num2);
				System.out.println("el resultado de la suma es: " + sumar(num1, num2));
				System.out.println("desea salir?");
				
				break;

			case '2':

				ingresarnumeros();
				resta(num1, num2);
				System.out.println("el resultado de la suma es: " + resta(num1, num2));
				System.out.println("desea salir?");
				break;

			case '3':

				ingresarnumeros();
				multiplicacion(num1, num2);
				System.out.println("el resultado de la suma es: " + multiplicacion(num1, num2));
				System.out.println("desea salir?");
				
				break;
			case '4':

				ingresarnumeros();
				division(num1, num2);
				System.out.println("el resultado de la suma es: " + division(num1, num2));
				System.out.println("desea salir?");
				break;

			default:
				System.out.println("Opción no válida.");
			}
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Error: Debes ingresar un dato válido.");
		}
		while (salir != true);

	}
}