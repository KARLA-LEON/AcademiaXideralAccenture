package com.pokemon;

public class Squirtle extends Pokemon implements iAgua{

    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Squirtle ha utilizado placaje");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Squirtle ha utilizado arañazo");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Squirtle ha utilizado mordisco");

    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Squirtle ha utilizado hidrobomba");

    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle ha utilizado burbujas");

    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle ha utilizado pistola de agua");

    }
}
