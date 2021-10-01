package com.company;

public class Main {

    public static void main(String[] args) {

        /*Dada una referencia ladrador del tipo Ladrador (Ladrador ladrador)*/

        Ladrador ladrador = new Doberman(); //ladrador es ahora del tipo Doberman()
        System.out.println(ladrador.ladrar()); //Polimorfismo
    }
}
//inrface cuidador
public interface Cuidador{
    public void String custodiar();
}

//interface ladrador
public interface Ladrador{
    public void String ladrar();
}

//clase doberman
public class Doberman implements Cuidador, Ladrador{
    public void String custodiar(){
        return “estoy atento custodiando la casa”;
    }

    public void String ladrar(){
        return “Guau! Guau!”;
    }

}