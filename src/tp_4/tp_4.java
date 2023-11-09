package tp_4;

import java.util.Scanner;

public class tp_4 {
	
	static String[] nombre = new String[3];
	static String[] apellido = new String[3];
	static int[] num_camiseta = new int[3];
	static String[] nombre_suplente = new String[4];
	static String[] apellido_suplente = new String[4];
	static int[] cam_suplente = new int[4];

	public static void ingresarDatos() {
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("ingrese el nombre " + (i + 1) + " : ");
			nombre[i] = entrada.next();

			System.out.println("ingrese el apellido " + (i + 1) + " : ");
			apellido[i] = entrada.next();

			System.out.println("ingrese el numero de camiseta " + (i + 1) + " : ");
			num_camiseta[i] = entrada.nextInt();

		}

	}

	public static void suplentes() {
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			nombre_suplente[i] = nombre[i];
			apellido_suplente[i] = apellido[i];
			cam_suplente[i] = num_camiseta[i];
		}

		System.out.println("quieres agregar a un jugador suplente? ");
		String suplente = entrada.next().toLowerCase();

		while (!suplente.equals("si") && !suplente.equals("no")) {

			System.out.println("\nerror,intenta devuelta: ");
			suplente = entrada.next().toLowerCase();
		}

		if (suplente.equals("si")) {

			System.out.println("ingrese el nombre del jugador suplente");
			nombre_suplente[3] = entrada.next();
			System.out.println("ingrese el apellido del jugador suplente ");
			apellido_suplente[3] = entrada.next();
			System.out.println("ingrese el numero de camiseta del jugador suplente");
			cam_suplente[3] = entrada.nextInt();

			analizarDatosCuatroJugadores();

		}

		if (suplente.equals("no")) {

			System.out.println("piola");

			analizarDatosTresJugadores();

		}

	}

	public static void analizarDatosTresJugadores() {
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("nombre del jugador " + (i + 1) + " : " + nombre[i]);
			System.out.println("apellido del jugador " + (i + 1) + " : " + apellido[i]);
			System.out.println("numero de camiseta " + (i + 1) + " : " + num_camiseta[i]);

		}

		System.out.println("el datos estan bien? ");
		String correcion = entrada.next();

		while (!correcion.equals("si") && !correcion.equals("no")) {

			System.out.println("error,vuelva a reintertarlo: ");
			correcion = entrada.next().toLowerCase();
		}

		if (correcion.equals("si")) {

			System.out.println(" ");

		}

		if (correcion.equals("no")) {

			System.out.println("ingrese el numero de camiseta");
			int busqcamiseta = entrada.nextInt();

			for (int i = 0; i < num_camiseta.length; i++) {

				if (busqcamiseta == num_camiseta[i]) {

					System.out.println("ingrese el nombre ");
					nombre[i] = entrada.next();

					System.out.println("ingrese el apellido ");
					apellido[i] = entrada.next();

					System.out.println("ingrese el numero de camiseta");
					num_camiseta[i] = entrada.nextInt();

					for (int e = 0; e < 3; e++) {
						System.out.println("nombre del jugador " + (e + 1) + " : " + nombre[e]);
						System.out.println("\napellido del jugador " + (e + 1) + " : " + apellido[e]);
						System.out.println("numero de camiseta del jugador " + (e + 1) + " : " + num_camiseta[e]);

					}

					System.out.println("reinicia devuelta el programa pelotudo");
				}

			}

		}

	}

	public static void analizarDatosCuatroJugadores() {
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			if (i < 3) {
				System.out.println("nombre del jugador " + (i + 1) + " : " + nombre_suplente[i]);

				System.out.println("apellido del jugador " + (i + 1) + " : " + apellido_suplente[i]);

				System.out.println("numero de camiseta del jugador " + (i + 1) + " : " + cam_suplente[i]);
			}
			if (i == 3) {
				System.out.println("nombre del jugador suplente " + nombre_suplente[i]);

				System.out.println("apellido del jugador suplente " + apellido_suplente[i]);

				System.out.println("numero de camiseta del jugador suplente " + cam_suplente[i]);
			}
		}

		System.out.println("todos los datos son correctos? ");
		String correcion = entrada.next();

		while (!correcion.equals("si") && !correcion.equals("no")) {

			System.out.println("error,vuelva a reintertarlo: ");
			correcion = entrada.next().toLowerCase();
		}

		if (correcion.equals("si")) {

			System.out.println("piola");
		}

		if (correcion.equals("no")) {

			System.out.println("\ningrese el numero de camiseta");
			int busqcamiseta = entrada.nextInt();

			for (int i = 0; i < cam_suplente.length; i++) {

				if (busqcamiseta == cam_suplente[i]) {

					System.out.println("ingrese el nombre del jugador ");
					nombre_suplente[i] = entrada.next();

					System.out.println("ingrese el apellido del jugador ");
					apellido_suplente[i] = entrada.next();

					System.out.println("ingrese el numero de camiseta del jugador ");
					cam_suplente[i] = entrada.nextInt();

					for (int r = 0; r < 4; r++) {
						if (r < 3) {
							System.out.println("nombre del jugador " + (r + 1) + " : " + nombre_suplente[r]);

							System.out.println("apellido del jugador " + (r + 1) + " : " + apellido_suplente[r]);

							System.out.println("numero de camiseta del jugador " + (r + 1) + " : " + cam_suplente[r]);
						}
						if (r == 3) {
							System.out.println("nombre del jugador suplente " + nombre_suplente[r]);

							System.out.println("apellido del jugador suplente " + apellido_suplente[r]);

							System.out.println("numero de camiseta del jugador suplente " + cam_suplente[r]);
						}
					}

					System.out.println("volve a ejecutar el programa imbecil");
				}

			}
		}

	}

	public static void main(String[] args) {
		ingresarDatos();
		suplentes();
	}
}
