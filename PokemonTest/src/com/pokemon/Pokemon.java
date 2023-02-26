package com.pokemon;
/*Pequeño programa en el cual se implementan las nociones de herencia, 
polimorfismo, clases abstractas e interfaces. El objetivo es crear una clase padre
que es Pokemon, la cual le heredara sus atributos (numero en la pokedex, nombre, etc)
y también sus métodos los cuales son los distintos ataques que tienen tanto todos
los pokemon
*/



//Clase abstracta
public abstract class Pokemon {

    //Se crean los atributos a los que sólo las clases hijas tendrán acceso
   protected int numPokedex;
   protected String nombre;
   protected double peso;
   protected String sexo;

   /*Ataques, las clases abstractas tienen
   tambien metodos abstractos que las clases hijas
   implementarán a su modo
   */
    //Método abstracto ya que no tiene implementacion directamente
    protected abstract void atacarPlacaje();
    protected abstract void atacarAranazo();
    protected abstract void atacarMordisco();

    /*cuando hay una especializacion y se necesita más el
    qué es lo que hace el objeto, y no lo que es, se
    utilizan interfaces y viceversa con clases abstractas*/




}
