package br.com.zup;

import java.util.Scanner;

public class Aula1_Exercicio2 {
    public static void main(String[] args) {
        // Notas bimestrais recebidas

        Scanner leitor = new Scanner(System.in);

        // Exibir a mensagem para o usuário sobre a média aritmética
        System.out.println("Por favor digite a primeira nota:");
        double nota1 = leitor.nextDouble();
        System.out.println("Por favor digite a segunda nota:");
        double nota2 = leitor.nextDouble();
        System.out.println("Por favor digite a terceira nota:");
        double nota3 = leitor.nextDouble();
        System.out.println("Por favor digite a quarta nota:");
        double nota4 = leitor.nextDouble();


        double somaDasNotas = nota1 + nota2 +nota3 + nota4;
        double mediaDasNotas = somaDasNotas/4;

        System.out.println("Olá, sua média nesse bimestre é " + mediaDasNotas + " Continue se dedicando em seus estudos!");


    }
}
