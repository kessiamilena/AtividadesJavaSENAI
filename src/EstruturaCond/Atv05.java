package EstruturaCond;

//Exercício: Verificação de idade
//Escreva um programa que solicita o ano de nascimento de uma pessoa e verifica se ela é maior de 18 anos.
//Exiba uma mensagem indicando se a pessoa é maior de idade ou não.

//const prompt = require('prompt-sync')();
//
//        const anoNascimento = parseInt(prompt('Digite o ano de nascimento: '));
//        const anoAtual = new Date().getFullYear();
//        const idade = anoAtual - anoNascimento;
//
//        if (idade >= 18) {
//        console.log('Você é maior de idade.');
//        } else {
//        console.log('Você é menor de idade.');
//        }

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Atv05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        String anoNascimento = sc.nextLine();

        Date anoAtual = new Date();

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");


    }
}
