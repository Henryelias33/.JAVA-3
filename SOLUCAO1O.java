public class SOLUCAO1O
    public static void main(String[] args) {
        byte[] input = new byte[100]; 
        int numero;
        int quantidadePrimos = 0;
        System.out.println("Digite números inteiros positivos (Digite um número não positivo para parar):");

        while (true) {
            try {
                // Lê a entrada do usuário
                int bytesRead = System.in.read(input);
                os em branco
                String inputStr = new String(input, 0, bytesRead).trim();
                
                // Converte a string para número inteiro
                numero = Integer.parseInt(inputStr);

                // Verifica se o número é não positivo, caso seja, interrompe o laço
                if (numero <= 0) {
                    break;
                }

                // Verifica se o número é primo usando divisores
                int divisores = 0;
                for (int i = 1; i <= numero; i++) {
                    if (numero % i == 0) {
                        divisores++;  
                }

              
                if (divisores == 2) {
                    quantidadePrimos++; // Incrementa a quantidade de números primos
                }
            } catch (IOException e) {
                System.out.println("Erro de leitura. Tente novamente.");
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            }
        }

        // Exibe a quantidade de números primos
        System.out.println("Quantidade de números primos digitados: " + quantidadePrimos);
    }
}
