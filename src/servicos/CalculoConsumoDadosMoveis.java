package servicos;

import java.util.Scanner;

public class CalculoConsumoDadosMoveis {
    
    // Função para calcular o consumo total de dados móveis no mês
    public static int calcularConsumoTotal(String[] consumoSemanal) {
        int total = 0;
        for (String consumo : consumoSemanal) {
            try {
                total += Integer.parseInt(consumo.trim());
            } catch (NumberFormatException e) {
                System.out.println("Erro: Valor inválido detectado. Verifique a entrada.");
                return -1;
            }
        }
        return total;
    }
    
        // Função para calcular a média semanal de consumo de dados móveis
    public static double calcularMediaSemanal(int totalConsumo, int numeroDeSemanas) {
        return (double) totalConsumo / numeroDeSemanas;
    }
       
    // Função para identificar a semana de maior consumo
    public static int identificarSemanaDeMaiorConsumo(String[] consumoSemanal) {
        int semanaDeMaiorConsumo = 0;
        int maiorConsumo = 0;
    
        for (int i = 0; i < consumoSemanal.length; i++) {
            try {
                int consumo = Integer.parseInt(consumoSemanal[i].trim());
                if (consumo > maiorConsumo) {
                    maiorConsumo = consumo;
                    semanaDeMaiorConsumo = i + 1;
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Valor inválido detectado na semana " + (i + 1) + ". Verifique a entrada.");
                return -1;
            }
        }
        return semanaDeMaiorConsumo;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        // Solicitando ao usuário a lista de consumos semanais em MB
        System.out.println("Digite o consumo semanal de dados móveis (em MB) para 4 semanas, separados por vírgula:");
        String input = scanner.nextLine();
    
        // Convertendo a entrada em uma lista de strings
        String[] consumoSemanal = input.split(",");
    
        // Calculando o consumo total de dados móveis no mês
        int totalConsumo = calcularConsumoTotal(consumoSemanal);
        if (totalConsumo == -1) return;
    
        // Calculando a média semanal de consumo de dados móveis
        double mediaSemanal = calcularMediaSemanal(totalConsumo, consumoSemanal.length);
    
        // Identificando a semana de maior consumo
        int semanaDeMaiorConsumo = identificarSemanaDeMaiorConsumo(consumoSemanal);
        if (semanaDeMaiorConsumo == -1) return;
    
        // Exibindo o consumo total de dados móveis no mês
        System.out.println("Total mensal: " + totalConsumo + " MB");
    
        // Exibindo a média semanal de consumo
        System.out.printf("Média semanal: %.2f MB%n", mediaSemanal);
    
        // Exibindo a semana de maior consumo
        System.out.println("Maior consumo: Semana " + semanaDeMaiorConsumo);
    
        scanner.close();
    }
}
