package com.patronSingleton;

/*Implementar un singleton para tener un objeto
 para una clase concreta, reduce el uso de memoria
 
 Este es un programa que simula la implementación de versiones de un e-commerce
 en sus distintas clases
 */

public class Main {

	public static void main(String[]args) {
		//Aquí en vez de crear el objeto se obtiene la instancia de Version, por lo tanto
		//Ya no es necesario instanciar el objeto usuario ni carrito de compras aquí
		//Ya que cada clase ahora puede acceder al método get instance
		Version version = Version.getInstance();
		//Usuario usuario = new Usuario(version);
		
		//CarritoDeCompras carritoDeCompras = new CarritoDeCompras(version);
		
	}
}
