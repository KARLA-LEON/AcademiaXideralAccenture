package com.patronSingleton;

public class Version {
	//Propiedades de la version
	private final int correccionMayor;
	private final int correccionMenor;
	private final int numDeTesteo;
	
	
	
	//private static final Version instance = new Version();
	private static Version instance = new Version();

	
	private Version() {
		this.correccionMayor=1;
		this.correccionMenor=0;
		this.numDeTesteo=2;
	}
//En vez de crear la version directamente en la propiedad, se crea únicamente cuando
	//se llame al método get instance, y que compruebe si es nula para que entonces la cree 
	//sólo cuando sea necesario
	public static Version getInstance() {
		//return instance;
		if (instance == null) {
			instance = new Version();
		}
		return instance;
	}
	
	
	

}
