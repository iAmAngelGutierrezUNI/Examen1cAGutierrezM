package ui;

import java.util.Scanner;

import dol.Vehiculo;

public class Agregar {
	private Scanner scan = new Scanner(System.in);
	MenuPrincipal menu = new MenuPrincipal();
	Vehiculo vehiculo = new Vehiculo();
	public void AgrearVehiculo() {
		System.out.println("Porfavor indique los sig. datos de su vehiculo");
		System.out.println("1. Marca.");
		vehiculo.setMarca(scan.next());
		System.out.println("2. Modelo.");
		vehiculo.setModelo(scan.next());
		System.out.println("3. Año.");
		vehiculo.setAño(scan.next());
		System.out.println("4. Chasis.");
		vehiculo.setChasis(scan.next());
		System.out.println("5. placa.");
		vehiculo.setPlaca(scan.next());
		System.out.println("Se a agregado su vehiculo");
		menu.MainMenu();
		
		}

}
