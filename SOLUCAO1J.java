public class SOLUCAO1J {
    public static void main(String[] args) {
        // números simulando uma entrada
        int[] numeros = {12, 25, 30, 50, -999};

        for (int numero : numeros) {
            // Se o número for -999, interrompe o loop
            if (numero == -999) {
                System.out.println("Encerrando o programa.");
                break;
            }

            // Imprime os divisores do número
            System.out.println("Divisores de " + numero + ":");
            for (int i = 1; i <= Math.abs(numero); i++) {
                if (numero % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
