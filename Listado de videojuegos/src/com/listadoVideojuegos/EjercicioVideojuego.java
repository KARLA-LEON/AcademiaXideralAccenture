package com.listadoVideojuegos;

import java.util.ArrayList;
import java.util.List;

public class EjercicioVideojuego {


    public static void main (String[]args){

    	//Creamos un arreglo en el cual vamos a ingresar los atributos de cada objeto
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

        //Agregamos los videojuegos al arreglo
        listaVideojuegos.add(juego1);
        listaVideojuegos.add(juego2);
        listaVideojuegos.add(juego3);
        listaVideojuegos.add(juego4);
        listaVideojuegos.add(juego5);

        //Queremos que cada uno de los elementos del arreglo
        //nos imprima en pantalla sus datos 
        for (Videojuego juego : listaVideojuegos){
            System.out.println("Título: "+ juego.getTitulo()+
                    " Consola: "+ juego.getConsola()+
                    " Jugadores: "+ juego.getCantidadJugadores()+
                    " Categoría: "+ juego.getCategoria());
        }

        //Cambiamos el nombre, jugadores y categoría de animal crossing usando set
        juego4.setTitulo("Legend of Zelda: Breath of the wild");
        juego4.setCantidadJugadores(1);
        juego4.setCategoria("Aventura");
        
        System.out.println("************************************");

        //Queremos que con un for each se recorran los elementos del arreglo
        //en busca de todos aquellos que cumplan con la característica
        for (Videojuego juego : listaVideojuegos) {
            if (juego.getConsola().equals("Nintendo switch")){
                System.out.println(juego.toString());

            }
        }


    }
}