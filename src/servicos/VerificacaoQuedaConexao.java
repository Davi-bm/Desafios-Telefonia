package servicos;

import java.util.Scanner;

public class VerificacaoQuedaConexao {
    
        // Função para verificar queda de conexão
        public static String verificarQuedaConexao(String[] velocidades) {
            for (String velocidade : velocidades) {
                try {
                    if (Integer.parseInt(velocidade.trim()) == 0) {
                        return "Queda de Conexão";
                    }
                } catch (NumberFormatException e) {
                    return "Erro: Valor inválido detectado. Verifique a entrada.";
                }
            }
            return "Sem Quedas";
        }
    
        public static void main(String[] args) {
            
            // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
            try (Scanner scanner = new Scanner(System.in)) {
                // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
                System.out.println("Digite as velocidades de conexão registradas a cada hora, separadas por vírgula:");
                String input = scanner.nextLine();
                
                // Convertendo a entrada em uma lista de strings
                String[] velocidades = input.split(",");
                
                // Verificando se houve queda de conexão
                String resultado = verificarQuedaConexao(velocidades);
                
                // Exibindo o resultado da verificação
                System.out.println(resultado);
            }
        }
    }