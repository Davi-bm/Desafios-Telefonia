package servicos;

import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        
        // Entrada do serviço a ser verificado
        try (Scanner scanner = new Scanner(System.in)) {
            // Entrada do serviço a ser verificado
            System.out.println("Digite o serviço a ser verificado:");
            String servico = scanner.nextLine().trim();
            
            // Entrada do nome do cliente e os serviços contratados
            System.out.println("Digite o nome do cliente e os serviços contratados separados por vírgula:");
            String entradaCliente = scanner.nextLine().trim();
            
            // Separando o nome do cliente e os serviços contratados
            String[] partes = entradaCliente.split(",");
            String nomeCliente = partes[0].trim();
            boolean contratado = false;
            
            // Verificando se o serviço está na lista de serviços contratados
            for (int i = 1; i < partes.length; i++) {
                if (partes[i].trim().equalsIgnoreCase(servico)) { // Usar equalsIgnoreCase para ignorar diferenças de maiúsculas/minúsculas
                    contratado = true;
                    break;
                }
            }
            
            // Saída do resultado
            if (contratado) {
                System.out.println("Sim, o serviço '" + servico + "' está contratado por " + nomeCliente + ".");
            } else {
                System.out.println("Não, o serviço '" + servico + "' não está contratado por " + nomeCliente + ".");
            }
        }
    }
}

