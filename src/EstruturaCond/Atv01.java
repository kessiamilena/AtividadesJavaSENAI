package EstruturaCond;

//Você irá gerar uma média de duas notas, e caso a nota seje maior igual a 6, precisa aparecer uma mensagem de parabéns,
// caso não seje maior igual a 6, informe ao usuário que ele não passou.


import java.util.Scanner;


public class Atv01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float primeiraNota = sc.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float segundaNota = sc.nextFloat();

        var media = (primeiraNota + segundaNota) / 2;

        if( media >= 6 ) {
            System.out.println("Meus parabéns!");
        } else {
            System.out.println("Você não passou. Estude um pouco mais!");
        }
    }
}