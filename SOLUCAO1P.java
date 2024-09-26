public class SOLUCAO1P {
    public static void main(String[] args) {
        int numero;
        int maior = Integer.MIN_VALUE;
        byte[] input = new byte[100]; // Array de bytes para armazenar a entrada do usuário

        System.out.println("Digite os números (Digite -9999 para parar):");

        while (true) {
            try {
                // Lê a entrad 
                int bytesRead = System.in.read(input);

                // Converte o array
                String inputStr = new String(input, 0, bytesRead).trim();

                // Converte a string em um número inteiro
                numero = Integer.parseInt(inputStr);

                // Verifica se o número digitado é -9999
                if (numero == -9999) {
                    break;
                }

                if (numero > maior) {
                    maior = numero;
                }
            } catch (IOException e) {
                System.out.println("Erro de leitura. Tente novamente.");
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            }
        }

        // Exibe o maior número encontrado
        if (maior != Integer.MIN_VALUE) {
            System.out.println("O maior número digitado foi: " + maior);
        } else {
            System.out.println("Nenhum número válido foi inserido.");
        }
    }
}
