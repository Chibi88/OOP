package com.Adriana;

public class UsuarioJuego {

    private String nombre;
    private String clave;
    private Double puntaje;
    private Integer nivel;

    public UsuarioJuego(String nombre, String clave){
        this.nombre= nombre;
        this.clave= clave;
        puntaje=0.0;
        nivel=0;
    }

    public void aumentarPuntaje(){
        System.out.println("Tu puntaje inicial era " + puntaje);
        puntaje++;
        System.out.println("Tu puntaje actual es " + puntaje);
    }

    public void subirNivel(){
        nivel++;
    }

    public void bonus(int valor) {
        puntaje += valor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }

    public Double getPuntaje() {
        return puntaje;
    }
}
