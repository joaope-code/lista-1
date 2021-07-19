package com.company;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos kilos de peixe você trouxe seu João?");
        int peso = scan.nextInt();
        if (peso>50){
            System.out.println("A multa vai ser no valor de " +(peso-50)*4  + "reais");
        }else {
            System.out.println("Você não vai precisar pagar a multa");
        }
    }
}
