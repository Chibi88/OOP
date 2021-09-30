package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cliente cliente = new Cliente(123,1234,1,"Perez");

        Cuenta cuenta = new CuentaCorriente(cliente,500.0,300.0);

        cuenta = new CuentaCajaDeAhorro(cliente,500.0,0.1);

    }
}
