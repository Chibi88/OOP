package com.company;

import java.util.Scanner;

public class Main {

            public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
                String nomA;
                String nomB;
                Integer opA = 0;
                Integer opB = 0;
                Integer winA = 0;
                Integer winB = 0;
                String end="y";
                System.out.println("Ingrese su nombre A: ");
                nomA = in.nextLine();

                System.out.println("Ingrese su nombre B: ");
                nomB = in.nextLine();
                while(end.equals("n")){
                    in.nextLine();
                    System.out.println("Piedra(1), Papel(2) o Tijera(3)-FIN(4) - Ingrese su eleccion A: ");
                    opA = in.nextInt();
                    in.nextLine();
                    System.out.println("Piedra(1), Papel(2) o Tijera(3)-FIN(4) - Ingrese su eleccion B: ");
                    opB = in.nextInt();
                    if(opA != 4 || opB != 4) {
                        if(cualGana(opA,opB) ==1 ) {
                            winA++;
                        }else if(cualGana(opA,opB) == 2) {
                            winB++;
                        }
                    }
                    System.out.println("Quieres seguir jugando: y/n");
                    end = in.nextLine();
                }

                if(winA == winB) {
                    System.out.println("No gana nadie xd");
                }else if(winA > winB){
                    System.out.println("Gano "+nomA);
                }else {
                    System.out.println("Gano "+nomB);
                }

            }

            static Integer cualGana(Integer opA, Integer opB) {
                Integer res;
                if (opA == opB) {
                    res = 0;
                } else if (
                        (opA == 1 && opB == 3) ||
                                (opA == 2 && opB == 1) ||
                                (opA == 3 && opB == 2)
                ) {
                    res = 1;
                } else {
                    res = 2;
                }

                return res;
            }
        }

