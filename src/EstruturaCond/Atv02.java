package EstruturaCond;

// Faça um programa que receba um número inteiro do usuário
// e informe se este número é positivo ou negativo.

import java.util.Scanner;

public class Atv02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para verificar se é positivo ou negativo: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.print("positivo");
        } else if (numero < 0) {
            System.out.print("negativo");
        } else {
            System.out.print("neutro");
        }
    }
}
