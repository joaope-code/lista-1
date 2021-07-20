package com.company;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o tamanho da área a ser pintada?");
        int area = scan.nextInt();

         int ap = area/3;
         int tinta = 18;
         int result = ap/tinta;
         int valor = 80;
        System.out.println("A quantidade de latas de tintas vai ser " + Math.round(result));
        System.out.println("Vai custar " +result*80);

    }
}
