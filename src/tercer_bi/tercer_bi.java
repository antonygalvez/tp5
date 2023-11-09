package tercer_bi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tercer_bi {

	static String[] titulo_libro = { "leonel_pitocorto", "mati_elmascapito", "Maradona", "Aymar", "Gallardo",
			"Palermo" };
	static String[] autor_libro = { "antony", "ariel", "matias", "leonel", "miguel", "brandon" };
	static int[] num_paginas = { 132, 124, 912, 587, 2000, 1534 };
	static boolean banderas = false;
	static char menu;
	static int opcion;
	static char sal;
	static String busquedas;

	public static void ingredatos() {
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println("que opcion desea hacer?");
			System.out.println("1- lista de libros");
			System.out.println("2- buscar libros: ");
			System.out.println("3- salir:");
			opcion = entrada.nextInt();

			if (opcion >= 4 || opcion <= 0) {
				throw new InputMismatchException();
			}
		} catch (InputMismatchException e) {
			System.out.println("ingrese un dato valido");
		}

	}

	public static void busqueda() {
		Scanner entrada = new Scanner(System.in);

		try {

			System.out.println("que libro desea buscar: ");
			busquedas = entrada.nextLine();
			busquedas = busquedas.toUpperCase();

			for (int i = 0; 1 < titulo_libro.length; i++) {

				if (busquedas.equals(titulo_libro[i].toUpperCase())) {

					System.out.println("\ntitulo " + titulo_libro);
				} else {
					throw new ArithmeticException();
				}
			}

		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Error: Debes ingresar un dato válido.");
		}

	}

	public static void seguirOno() {
		Scanner datos = new Scanner(System.in);
		System.out.println("quiere seguir en el programa? (elegir S o N)");
		sal = datos.next().charAt(0);

		if (sal == 'S' || sal == 's') {
			banderas = false;
		}
		if (sal == 'N' || sal == 'n') {
			banderas = true;
		}
	}

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		while (banderas != true) {
			ingredatos();
			switch (menu) {
			case 1: {

				seguirOno();
				break;
			}

			case 2: {
				busqueda();
				seguirOno();
				break;
			}

			case 3: {
				banderas = true;
				break;
			}

			}
		}
	}
}