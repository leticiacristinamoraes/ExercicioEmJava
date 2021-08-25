package br.com.zup;

public class Aula1_Exercicio6 {
    public static void main(String[] args) {

        // Variáveis com o valor das horas trabalhas e o número de horas trabalhadas
        double valorHoraTrabalhada = 55.20;
        double horasTrabalhadas = 180;

        // Valor do salário bruto
        double salarioBruto = valorHoraTrabalhada * horasTrabalhadas;

        // Descontos incidentes sobre o salário bruto
        double impostoDeRenda = 0.11 * salarioBruto;
        double inss = 0.08 * salarioBruto;
        double sindicato = 0.05 * salarioBruto;

    }
}
