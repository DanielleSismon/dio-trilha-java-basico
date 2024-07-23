/* Primeiramente importamos as classes da biblioteca:

#1 - A classe Locale em Java: é utilizada para representar uma região geográfica ou cultural específica, o que pode incluir um país,
uma linguagem e até mesmo variações específicas de um idioma em um país. A classe Locale é especialmente útil em aplicações que 
precisam ser internacionalizadas, ou seja, adaptadas para diferentes idiomas e regiões. Ex: formatação de número, moedas, data, hora.
Isso torna as aplicações mais adaptáveis e acessíveis a um público geral.

#2 - A classe Scanner em Java: é usada para ler entrada do usuário, seja a partir do teclado, de um arquivo oude qualquer outra fonte
de entrada. Ela facilita a leitura de diferentes tipos de dados como strings, números inteiros, números de ponto flutuante, etc. 
*/ 

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    // Declarando as variáveis;
          double saldo = 5297.69;
        

        // Criando o objeto scanner da classe Scanner:
        Scanner scanner = new Scanner(System.in).useLocale(Locale.forLanguageTag("pt-BR"));

        System.out.println("Por favor digite seu nome e tecle Enter.");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número de sua conta e tecle Enter.");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Por favor digite o número de sua agência e tecle Enter.");
        int numeroAgencia = scanner.nextInt();

        // Fechando o scanner (essencial!):
        scanner.close();
        
        System.out.println("Olá " + nomeCliente + "! \nSeja bem vindo(a)! Obrigado por criar uma conta em nosso banco. \nSua agência é: "
        + numeroAgencia + "\nConta número: " + numeroConta + "\nSeu saldo de R$ " + saldo + " já está disponível para saque.");
    }
};
