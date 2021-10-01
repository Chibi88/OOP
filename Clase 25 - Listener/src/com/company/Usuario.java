package com.company;

import java.util.ArrayList;
import java.util.List;

public class Usuario implements Sujeto{

    private String nombre;
    private String apellido;
    private List<Observador> seguidores;
    private Boolean subioUnaFoto;

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        seguidores = new ArrayList<>();
    }

    @Override
    public void agregar(Observador observador) {
        seguidores.add(observador);
    }

    @Override
    public void eliminar(Observador observador) {
        seguidores.remove(observador);
    }

    @Override
    public void notificar() {
        for (Observador seguidor : seguidores) {
            seguidor.actualizar(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void subirFoto(){
        subioUnaFoto = true;
        notificar();
    }
}
