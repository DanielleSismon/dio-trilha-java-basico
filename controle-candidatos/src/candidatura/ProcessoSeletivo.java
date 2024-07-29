package candidatura;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        
        selecaoCandidatos();
    }

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



