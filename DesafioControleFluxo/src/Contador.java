import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        // Criando o objeto de leitura do teclado nomeando como "terminal" através da classe Scanner importada acima:
        Scanner terminal = new Scanner(System.in).useLocale(Locale.forLanguageTag("pt-BR"));
        
        
        System.out.println("Por favor digite um número positivo."); // Imprimindo o pedido de entrada na tela
        int numeroUm = terminal.nextInt(); // Obtendo o conteúdo digitado em string e transformando-o em tipo inteiro

        System.out.println("Por favor digite o segundo número maior que o anterior digitado.");
        int numeroDois = terminal.nextInt();

        terminal.close();

        try {
            // Chamando o método contar() a ser criado abaixo:
            contar(numeroUm, numeroDois);
        } catch (ParametrosInvalidosException exception) {
            // Imprimir a mensagem: "O segundo parâmetro deve ser maior que o primeiro parâmetro.":
            System.out.println(exception.getMessage());
        }
    }

    static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException {
        // Validando se numeroUm é MAIOR que numeroDois e lançar a exceção:
        if(numeroUm > numeroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro parâmetro.");
        }
    
        int contagem = numeroDois - numeroUm;

        // Realizando o FOR para imprimir os números com base na variável contagem:
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
    }
  }
