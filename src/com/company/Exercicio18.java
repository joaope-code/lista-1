package com.company;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        //criar uma variavel mb e mbps
        //Eu sei que eu preciso dividir o megabit por 8
        //
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tamanho do arquivo");
        double tam = scan.nextDouble();

        System.out.println("Digite a velocidade da conexão");
        double cone = scan.nextDouble();
        System.out.println("Vai demorar aproxidamente "+(tam/(cone/8))+" segundos");



    }
}
