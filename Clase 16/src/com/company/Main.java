package com.company;



public class Main {

    public static void main(String[] args) {
        // write your code here

        Equipo equipo = new Equipo("Huracan");

        equipo.agregarJugador(new Jugador(1,"Liam",true,true));
        equipo.agregarJugador(new Jugador(1,"Lean",true,false));
        equipo.agregarJugador(new Jugador(3,"Diego",false,false));
        equipo.agregarJugador(new Jugador(2,"Leo",true,false));
        equipo.agregarJugador(new Jugador(4,"Emilio",true,true));

        equipo.mostrarJugadoresTitulares();
    }
}