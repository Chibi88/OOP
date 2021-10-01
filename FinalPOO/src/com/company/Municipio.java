package com.company;

import java.util.ArrayList;
import java.util.List;

public class Municipio {

    private List<Propiedad> propiedades;

    public Municipio() {
        propiedades = new ArrayList<>();
    }

    public void mostrarPropiedades (){
        for (Propiedad propiedad : propiedades) {
            System.out.println(propiedad);
        }
    }

    public void agregarPropiedad (String nombrePropiedad){
        propiedades.add(PropiedadFactory.getInstance().crearPropiedad(nombrePropiedad));
    }

}
