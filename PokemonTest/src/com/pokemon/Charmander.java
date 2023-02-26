package com.pokemon;
//Aquí decimos que la clase Charmander hereda de la clase Pokemon e implementa los metodos de la interfaz iFuego

public class Charmander extends Pokemon implements iFuego{

    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander ha utilizado placaje");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Charmander ha utilizado arañazo");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Charmander ha utilizado mordizco");

    }

    @Override
    public void atacarpunoFuego() {
        System.out.println("Charmander ha utilizado puño de fuego");

    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Charmander ha utilizado lanza llamas");

    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander ha utilizado ascuas");

    }
}
