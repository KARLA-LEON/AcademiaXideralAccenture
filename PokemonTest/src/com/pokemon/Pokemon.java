package com.pokemon;
//Clase abstracta
public abstract class Pokemon {

    //Sólo las clases hijas tendrán acceso
   protected int numPokedex;
   protected String nombre;
   protected double peso;
   protected String sexo;

   /*Ataques, las clases abstractas tienen
   tambien metodos abstractos que las clases hijas
   implementarán a su modo
   */
    //Método abstracto ya que no tiene implementacion
    protected abstract void atacarPlacaje();
    protected abstract void atacarAranazo();
    protected abstract void atacarMordisco();

    /*cuando hay una especializacion y se necesita más el
    qué es lo que hace el objeto, y no lo que es, se
    utilizan interfaces y viceversa con clases abstractas*/




}
