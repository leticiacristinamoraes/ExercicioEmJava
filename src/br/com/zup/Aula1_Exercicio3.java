package br.com.zup;

import java.util.Scanner;

public class Aula1_Exercicio3 {
    public static void main(String[] args) {
        // Variável que recebe a informação de quantos metros serão convertidos
        // e qual é o valor de cada metro em centímetros
        Scanner leitor = new Scanner(System.in);
        float metrosEmCentímetros = 1000F;

        // Variável que faça a conversão de metros em centímetros


        // Exibindo a mensagem de conversão
        System.out.println("Para fazer uma conversão de metros em centímetros, digite o valor:");
        float metros = leitor.nextFloat();
        float conversao = metros * metrosEmCentímetros;
        System.out.println("Esses " + metros + " metros equivalem a " + conversao + " centímetros");

    }
}
