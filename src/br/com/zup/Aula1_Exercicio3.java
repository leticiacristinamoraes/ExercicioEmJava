package br.com.zup;

public class Aula1_Exercicio3 {
    public static void main(String[] args) {
        // Variável que recebe a informação de quantos metros serão convertidos
        // e qual é o valor de cada metro em centímetros
        float metros = 4.7F;
        float metrosEmCentímetros = 1000F;

        // Variável que faça a conversão de metros em centímetros
        float conversao = metros * metrosEmCentímetros;

        // Exibindo a mensagem de conversão
        System.out.println("Esses " + metros + " metros equivalem a " + conversao + " centímetros");

    }
}
