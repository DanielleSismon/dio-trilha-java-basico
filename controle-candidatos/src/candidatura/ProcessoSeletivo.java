package candidatura;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.forLanguageTag("pt-BR")); // Define o locale para português BR
        String [] candidatos = {"Marcio", "Beatriz", "Leandro", "Nadia", "Aline"};

        for(String candidato: candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atenderTelefone();
            continuarTentando = !atendeu;

            if(continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso!");
            }
        } while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu) {
            System.out.println("Conseguimos contato com: " + candidato + " na " + tentativasRealizadas + "a. tentativa.");
            } else {
                System.out.println("Não conseguimos contato com " + candidato + ", número máximo de: " + tentativasRealizadas + " tentativas realizadas.");
            }
    }

    // Método auxiliar para o case 4 onde se simula através de uma expressão randômica (sorteio), uma chamada de lugação telefônica:
    static boolean atenderTelefone() {
        return new Random().nextInt(3)==1; // ==1 significa que atenderam ao telefone
    }

// Criando o método para cumprir com o Case 3:
    
    static void imprimirSelecionados() {
                
        String [] candidatos = {"Ana Carolina", "Renata", "Eliana", "Elisa", "Isabela"};

        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento: ");

        for(int indice=0; indice < candidatos.length; indice++) {
            System.out.println("Candidato(a) de numero " + (indice+1) + ": " + candidatos[indice]);
        }

        System.out.println("========================================================================");

        // Quando não se precisa imprimir o índice, pode-se abreviar unsando o for each: 
        System.out.println("Uma segunda forma de se usar o for sendo abreviada, usando o FOR EACH:");
        System.out.println("========================================================================");

        for(String candidato: candidatos) {
            System.out.println("O candidato selecionado foi: " + candidato);
        }
    }

// Criando o método para cumprir com o Case 2:
    static void selecaoCandidatos() {
        Locale.setDefault(Locale.of("pt", "BR")); // Usando o Locale.of() para definir o local para pt-BR
        String [] candidatos = {"Estela", "Ana Carolina", "Renata", "Eliana", "Elisa", "Raquel", "Isabella", "Denise", "Bruna", "Paula", 
        "Danielle", "Mariana", "Francisco", "Charles", "Gabriel"};
        
        int candidatosSelecionados = 0;
        int candidatosAtuais = 0;
        double salarioBase = 2000.00;

        while(candidatosSelecionados < 5 && candidatosAtuais < candidatos.length) {
            String candidato = candidatos[candidatosAtuais];
            double salarioPretendido = valorPretendido();

           
            //System.out.println("O(a) candidato(a) " + candidato + " solicitou o seguinte valor de salário: R$ " + salarioPretendido);
            // Imprimir a mensagem formatando o acento agudo e dois números após o ponto flutuante:
            System.out.println(String.format(Locale.getDefault(), "O(a) candidato(a) %s solicitou o seguinte valor de  salário: R$ %.2f", candidato, salarioPretendido));
            

            if (salarioBase >= salarioPretendido) {
                System.out.println("O(a) candidato(a) " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatosAtuais++;
        }
    }

    // Método usado para sortear valor pretendido de salário entre 1800 e 2200:
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.00;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato.");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta.");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos.");
        }
    }
}



