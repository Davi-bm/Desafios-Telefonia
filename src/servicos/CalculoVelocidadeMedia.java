package servicos;

import java.util.Scanner;

public class CalculoVelocidadeMedia {

    // Função para calcular a velocidade média de conexão de internet
    public static double calcularVelocidadeMedia(String[] velocidades) {
        int total = 0;

        // Convertendo cada velocidade de string para int e somando ao total
        for (String velocidade : velocidades) {
            try {
                total += Integer.parseInt(velocidade.trim());
            } catch (NumberFormatException e) {
                System.out.println("Erro: Valor inválido detectado. Verifique a entrada e tente novamente.");
                return -1;
            }
        }

        // Calculando a média
        return (double) total / velocidades.length;
    }

    public static void main(String[] args) {
        
        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
            System.out.println("Digite as velocidades de conexão registradas a cada hora, separadas por vírgula:");
            String input = scanner.nextLine();
            
            // Convertendo a entrada em uma lista de strings
            String[] velocidades = input.split(",");
            
            // Calculando a velocidade média de conexão
            double velocidadeMedia = calcularVelocidadeMedia(velocidades);
            
            // Verificando se o cálculo foi bem-sucedido antes de exibir o resultado
            if (velocidadeMedia != -1) {
                // Exibindo a velocidade média de conexão com uma casa decimal
                System.out.printf("Velocidade média: %.1f Mbps%n", velocidadeMedia);
            }
        }
    }
}
