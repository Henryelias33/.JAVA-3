public class SOLUCAO1M {

    public static void main(String[] args) {

        // Exemplo de entrada
        int numero = 29; 

        // Chama o método para verificar se é primo
        int divisores = verificarPrimo(numero);

        // Se o número tem apenas dois divisores (1 e ele mesmo), é primo
        if (divisores == 2) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }
    }

    // Método para contar os divisores de um número
    public static int verificarPrimo(int num) {
        int contadorDivisores = 0; 

        // Números menores que 2 não são primos
        if (num < 2) {
            return contadorDivisores; 
        }

        // Verifica quantos divisores o número tem
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contadorDivisores++; 
            }
        }

        return contadorDivisores;
    }
}

