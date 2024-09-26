public class SOLUCAO1I {
    public static void main(String[] args) {
        int soma = 0;  // Inicializa a variável que armazenará a soma dos números

        // Loop de 1 até 100
        for (int i = 1; i <= 100; i++) {
            System.out.println(i); 
            
        // Adiciona o valor de 'i' à variável soma
           soma += i;
        }

        // Imprime o valor final da soma
        System.out.println("A soma de todos os números de 1 a 100 é: " + soma);
    }
}
