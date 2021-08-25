package br.com.zup;

public class Aula1_Exercicio5 {
    public static void main(String[] args) {

        // Variável com a temperatura em fahrenheit
        int temperaturaEmFahrenheit = 50;

        // Variável que faz a conversão de graus fahrenheit em celsius
        int conversao = (temperaturaEmFahrenheit - 32) * 5/9;

        // Exibir para o usuário a conversão das temperaturas
        System.out.println(temperaturaEmFahrenheit + "°F equivalem a " + conversao + "°C");


    }
}
