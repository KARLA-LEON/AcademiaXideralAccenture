package com.polimorfismo;

public abstract class Cubo {
	protected int dimension;
	protected String nombre;
	protected String material;
	
	public void destruir() {
		System.out.println("Oops me rompi");
	}

}
