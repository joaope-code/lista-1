package com.company;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o seu salário?");
        double sala = scan.nextFloat();
        double renda = sala *0.11 ;
        double inss = sala *0.08;
        double sindi = sala *0.05;
        System.out.println("O salário bruto foi " + (sala));
        System.out.println("Você  pagou ao INSS " + inss);
        System.out.println("Você pagou ao sindicato " + sindi);
        System.out.println("O salário liquido foi " + (sala - renda - inss -sindi));


    }
}
