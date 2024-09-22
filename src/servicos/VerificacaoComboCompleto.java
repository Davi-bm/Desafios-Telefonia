package servicos;

import java.util.Scanner;

public class VerificacaoComboCompleto {

    // Função para verificar se o cliente contratou um combo completo
    public static String verificarComboCompleto(String[] servicosContratados) {
        // Variáveis booleanas para verificar a contratação de cada serviço
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        // Itera sobre os serviços contratados
        for (String servico : servicosContratados) {
            switch (servico.trim().toLowerCase()) { // Usando toLowerCase para evitar problemas de case sensitivity
                case "movel" -> movelContratado = true;
                case "banda larga" -> bandaLargaContratada = true;
                case "tv" -> tvContratada = true;
            }
        }

        // Verifica se todos os serviços foram contratados
        if (movelContratado && bandaLargaContratada && tvContratada) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitando ao usuário a lista de serviços contratados
            System.out.println("Digite os serviços contratados (separados por vírgula):");
            String input = scanner.nextLine();

            // Convertendo a entrada em uma lista de strings
            String[] servicosContratados = input.split(",");

            // Verificando se o cliente contratou um combo completo
            String resultado = verificarComboCompleto(servicosContratados);

            // Exibindo o resultado
            System.out.println(resultado);
        }
    }
}


