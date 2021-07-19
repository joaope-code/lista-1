package com.company;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        //pedir para o usuário digitar sua altura
        //Para homens: (72.7*h) - 58
        //Para mulheres: (62.1*h) - 44.7
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a sua altura");
        float alt = scan.nextFloat();
        System.out.println("Digite a inicial do seu sexo M ou F");
        String sx = scan.next();
        if (sx.equalsIgnoreCase("m")){
            System.out.println((alt*72.7)-58);
        }else if (sx.equalsIgnoreCase("f")){
            System.out.println((alt*62.1)-44.7);
        }
    }
}
