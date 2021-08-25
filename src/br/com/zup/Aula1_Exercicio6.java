package br.com.zup;

import java.util.Scanner;

public class Aula1_Exercicio6 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // Variáveis com o valor das horas trabalhas e o número de horas trabalhadas
        double valorHoraTrabalhada = leitor.nextDouble();
        double horasTrabalhadas = leitor.nextDouble();

        // Valor do salário bruto
        double salarioBruto = valorHoraTrabalhada * horasTrabalhadas;

        // Descontos incidentes sobre o salário bruto
        double impostoDeRenda = 0.11 * salarioBruto;
        double inss = 0.08 * salarioBruto;
        double sindicato = 0.05 * salarioBruto;

        // Soma dos descontos do salário
        double descontos = impostoDeRenda+inss+sindicato;
        double salarioLiquido = salarioBruto - descontos;



        // Exibir ao usuário o valor do salário bruto, valor pago ao inss, valor pago ao sindicato e o salário líquido
        System.out.println("Seu salário bruto é de R$" + salarioBruto + " esse mês.");
        System.out.println("O valor descontado referente ao INSS foi de R$" + inss);
        System.out.println("O valor descontado do salário que foi pago ao sindicato foi de R$" + sindicato);
        System.out.println("Seu salário líquido após todos os descontos é de R$" + salarioLiquido);

    }
}
