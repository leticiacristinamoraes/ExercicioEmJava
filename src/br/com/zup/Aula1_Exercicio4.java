package br.com.zup;

public class Aula1_Exercicio4 {
    public static void main(String[] args) {
        // Variáveis com o valor da hora trabalhada e o número de horas trabalhadas durante o mês
        double valorHoraTrabalhada = 35.70;
        double horasTrabalhadas = 105.5;

        // Salário a receber em função das horas trabalhadas
        double salarioAReceber = valorHoraTrabalhada * horasTrabalhadas;

        // Exibir ao usuário o número de horas trabalhadas durante o mês e seu respectivo salário
        System.out.println("Você trabalhou " + horasTrabalhadas + " horas neste mês.");
        System.out.println("Seu salário esse mês será: R$" + salarioAReceber);

    }
}
