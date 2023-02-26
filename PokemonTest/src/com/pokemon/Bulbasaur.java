package com.pokemon;

//Aquí decimos que la clase Bulbasaur hereda de la clase Pokemon e implementa los metodos de la interfaz iPlanta

public class Bulbasaur extends Pokemon implements iPlanta{

    public Bulbasaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Bulbasaur ha utilizado placaje");

    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Bulbasaur ha utilizado arañazo");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Bulbasaur ha utilizado mordisco");

    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasaur ha utilizado Drenaje");

    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasaur ha utilizado Paralizar");

    }
}
