package com.company;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual a área a ser pintada? ");
        double area = scan.nextDouble();
        double ap = area/6;
        double valorG = 25, valorL = 80;
        double tintaL = 18;
        double tintaG = 3.6;
        double resOne = ap/18;
        double resTwo = ap/tintaG;
        double resTheer = 21.6;
        



        System.out.println("Se comprar apenas latas de 18l o valor vai ser " +  resOne);
        System.out.println("Se comprar apenas galões de 3.6l " + resTwo );
        System.out.println("");




    }
}
