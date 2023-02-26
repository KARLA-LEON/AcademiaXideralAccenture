package com.listadoVideojuegos;

import java.util.ArrayList;
import java.util.List;

public class EjercicioVideojuego {


    public static void main (String[]args){

        List<Videojuego> listaVideojuegos = new ArrayList<Videojuego>();

        //Creacion de objeto mediante constructor
        //con parámetros
        Videojuego juego1 = new Videojuego(
                111,
                "Fallout 3",
                "Xbox360",
                1,
                "RPG");

        Videojuego juego2 = new Videojuego(
                222,
                "Age of mythology",
                "PC",
                12,
                "Estrategia");

        Videojuego juego3 = new Videojuego(
                333,
                "Dragon Age",
                "Xbox360",
                1,
                "RPG");

        Videojuego juego4 = new Videojuego(
                444,
                "Animal Crossing",
                "Nintendo switch",
                2,
                "Simulación");

        Videojuego juego5 = new Videojuego(
                555,
                "Sims 2",
                "PC",
                4,
                "Simulación");

        listaVideojuegos.add(juego1);
        listaVideojuegos.add(juego2);
        listaVideojuegos.add(juego3);
        listaVideojuegos.add(juego4);
        listaVideojuegos.add(juego5);

        for (Videojuego juego : listaVideojuegos){
            System.out.println("Título: "+ juego.getTitulo()+
                    "Consola: "+ juego.getConsola()+
                    "Jugadores: "+ juego.getCantidadJugadores()+
                    "Categoría: "+ juego.getCategoria());
        }

        //Cambiar nombre y jugadores a animal crossing usando set
        juego4.setTitulo("Legend of Zelda: Breath of the wild");
        juego4.setCantidadJugadores(1);
        //juego4.setCategoria("Aventura");
        //System.out.println(juego4);

        //
        for (Videojuego juego : listaVideojuegos) {
            if (juego.getConsola().equals("Nintendo switch")){
                System.out.println(juego.toString());

            }
        }


    }
}