package com.polimorfismo;

//Pequeño y simple programa basado en bloques de minecrafts, para ejemplificar polimorfismo

public class Main {
	public static void main(String[]args) {
		//Creamos los objetos
		Carbon carbonsito = new Carbon();
		//Mandamos a llamar al método destruir
		carbonsito.destruir();
		Diamante diamantito = new Diamante();
		diamantito.destruir();
	}

}
