package ui;

import java.util.Scanner;

public class MenuPrincipal {
	Scanner scan = new Scanner(System.in);
	public void MainMenu() {
		System.out.println("1. Agregar vehiculo.");
		System.out.println("2. mostrar vehiculo.");
		System.out.println("3. salir.");
		
		int opcion = scan.nextInt();
		switch (opcion) {
		case 1: Agregar carro = new Agregar();
			carro.AgrearVehiculo();
			
		case 2: Mostrar MostrarVe = new Mostrar();
				MostrarVe.MostrarV();
			break;
		
		default: System.out.println("Opcion invalida");
			break;
		}
	}
}
