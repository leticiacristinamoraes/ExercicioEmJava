package br.com.zup;

import java.util.Scanner;

public class Aula1_Exercicio4 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        // Variáveis com o valor da hora trabalhada e o número de horas trabalhadas durante o mês


        // Salário a receber em função das horas trabalhadas

        // Exibir ao usuário o número de horas trabalhadas durante o mês e seu respectivo salário
        System.out.println("Por favor insira o valor da hora trabalhada:");
        double valorHoraTrabalhada = leitor.nextDouble();
        System.out.println("Por favor insira o total de horas trabalhadas no mês:");
        double horasTrabalhadas = leitor.nextDouble();
        double salarioAReceber = valorHoraTrabalhada * horasTrabalhadas;

        System.out.println("Você trabalhou " + horasTrabalhadas + " horas neste mês.");
        System.out.println("Seu salário esse mês será: R$" + salarioAReceber);

    }
}
