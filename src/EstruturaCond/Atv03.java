package EstruturaCond;

//Exercício: Verificação de dia da semana
//Escreva um programa que solicita ao usuário um número de 1 a 7 representando um dia
//da semana e exibe o nome correspondente a esse dia. Considere que 1 representa segunda-feira,
//2 representa terça-feira e assim por diante.


import java.util.Scanner;

public class Atv03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int numero = sc.nextInt();

        String dia = "";

            switch (numero) {
                case 1:
                dia = "segunda-feira";
                break;
                case 2:
                dia = "terça-feira";
                break;
                case 3:
                dia = "quarta-feira";
                break;
                case 4:
                dia = "quinta-feira";
                break;
                case 5:
                dia = "sexta-feira";
                break;
                case 6:
                dia = "sábado";
                break;
                case 7:
                dia = "domingo";
                break;
                default:
                System.out.print("Dígito inválido. Digite um número de 1 a 7.");
                break;
        }

        System.out.print("O número " + numero + " corresponde a " + dia + ".");
    }
}
