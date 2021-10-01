package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Usuario usuario = new Usuario("Paulo", "Londra");
        Seguidor seguidor1 = new Seguidor("Lara","Schneeberger");
        Seguidor seguidor2 = new Seguidor("Maria", "Brajkovic");
        Seguidor seguidor3 = new Seguidor("Bren", "Calzada");

        usuario.agregar(seguidor1);
        usuario.agregar(seguidor2);
        usuario.agregar(seguidor3);

        usuario.notificar();
    }
}
