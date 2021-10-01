package com.Adriana;

public class Main {

    public static void main(String[] args) {

        UsuarioJuego usuario1= new UsuarioJuego("Lucas", "Meme");
        UsuarioJuego usuario2= new UsuarioJuego("Ayelén", "LaAye");

        usuario1.subirNivel();
        System.out.println(usuario1.getNivel());
        usuario1.subirNivel();
        System.out.println(usuario1.getNivel());

        usuario2.bonus(300);
        System.out.println(usuario2.getPuntaje());

    }
}
