package com.polimorfismo;

//Creamos la clase abtracta Cubo de la cual obtendremos los atributos de cada bloque
//Y el método destruir
public abstract class Cubo {
	protected int dimension;
	protected String nombre;
	protected String material;
	
	public void destruir() {
		System.out.println("Oops me rompi");
	}

}
