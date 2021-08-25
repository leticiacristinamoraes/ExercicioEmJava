package br.com.zup;

import java.util.Scanner;

public class Aula1_Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Variável com a temperatura em fahrenheit


        // Variável que faz a conversão de graus fahrenheit em celsius


        // Exibir para o usuário a conversão das temperaturas
        System.out.println("Digite a temperatura em Fahrenheit para saber a conversão para graus Celsius:");
        int temperaturaEmFahrenheit = leitor.nextInt();
        int conversao = (temperaturaEmFahrenheit - 32) * 5/9;
        System.out.println(temperaturaEmFahrenheit + "°F equivalem a " + conversao + "°C");


    }
}
