package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numéro inteiro");
        int valueOne = scan.nextInt();
        System.out.println("Digite o segundo numéro inteiro");
        int valueTwo = scan.nextInt();
        System.out.println("Digite um numéro real");
        int real = scan.nextInt();

        System.out.println((valueOne*2) + valueTwo *0.5);
        System.out.println((valueOne*3) + real);
        System.out.println(Math.pow(real, 3));
    }
}
