public class SOLUCAO1N{

    public static void main(String[] args) {
        
       // Exemplo de entrada de números inteiros 
        int[] numeros = {11, 17, 20, 23, 0}; 
          int totalPrimos = 0; // Contador de números primos

             for (int i = 0; i < numeros.length; i++) {
               int numero = numeros[i]; 

                 // Parar quando um número não positivo for encontrado
                   if (numero <= 0) {
                    break;
            }

                        // Chama o método para verificar se o número é primo
                    if (contarDivisores(numero) == 2) {
                totalPrimos++;
            }
        }

        // Exibe o total de números primos
      System.out.println("Quantidade de números primos: " + totalPrimos);
    }

  // Método para contar quantos divisores um número tem
 public static int contarDivisores(int num) {
int contadorDivisores = 0;

   // Verifica quantos divisores o número tem
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contadorDivisores++; 
            }
        }

         contadorDivisores; // Retorna o número total de divisores
    }
}
