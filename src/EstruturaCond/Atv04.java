package EstruturaCond;

//Exercício: Verificação de login
//Escreva um programa que solicita ao usuário um nome de usuário e uma senha.
//Verifique se o nome de usuário é "admin" e a senha é "senha123".
//Exiba uma mensagem indicando se o login foi bem-sucedido ou não.


import java.util.Scanner;

public class Atv04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome de usuário: ");
        String usuario = sc.nextLine();

        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();


        if (usuario.equals("admin") && senha.equals("senha123")) {
            System.out.print("Login bem-sucedido!");
        } else {
            System.out.print("Nome de usuário ou senha incorretos.");
        }
    }
}
