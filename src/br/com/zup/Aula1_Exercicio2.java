package br.com.zup;

public class Aula1_Exercicio2 {
    public static void main(String[] args) {
        // Notas bimestrais recebidas
        float nota1 = 8.5F;
        float nota2 = 7.7F;
        float nota3 = 9.2F;
        float nota4 = 9;

        // Criando variáveis para somar as notas bimestrais e fazer a média aritmética
        float somaDasNotas = nota1 + nota2 +nota3 + nota4;
        float mediaDasNotas = somaDasNotas/4;

        // Exibir a mensagem para o usuário sobre a média aritmética
        System.out.println("Olá, sua média nesse bimestre é " + mediaDasNotas + " Continue se dedicando em seus estudos!");


    }
}
