package ui;

import dol.Vehiculo;

public class Mostrar {
	Vehiculo ve = new Vehiculo();
	public void MostrarV() {
		System.out.println(System.out.printf("%s |%s |%s |%s|%s" ,ve.getMarca()+" "+ve.getModelo()+""+ve.getAño()+""+ve.getChasis()+""+ve.getPlaca());
	}

}
