package com.patronSingleton;

/*Implementar un singleton para tener un objeto
 para una clase concreta, reduce el uso de memoria
 
 Este es un programa que simula la implementación de versiones de un e-commerce
 en sus distintas clases
 */

public class Main {

	public static void main(String[]args) {
		
		Version version = Version.getInstance();
		//Usuario usuario = new Usuario(version);
		CarritoDeCompras carritoDeCompras = new CarritoDeCompras(version);
		
	}
}
