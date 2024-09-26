import javax.swing.JOptionPane;
public class SOLUCAO1F {
    public static void main(String[] args) {
        // Obtenção do console
        java.io.Console console = System.console();

        // Verifica se o console está disponível (não funciona em alguns IDEs)
        if (console == null) {
            System.out.println("Console não está disponível.");
            return;
        }

        double numero = 0;

        // Continua até o número digitado ser -999
        while (numero != -999) {
            // Lê o número como string e o converte para double
            String input = console.readLine("Digite um número (ou -999 para encerrar): ");
            try {
                numero = Double.parseDouble(input);
                
                // Se o número digitado for diferente de -999, calcula a raiz quadrada e o inverso
                if (numero != -999) {
                    // Calcula a raiz quadrada se o número for não-negativo
                    if (numero >= 0) {
                        System.out.println("Raiz quadrada de " + numero + ": " + Math.sqrt(numero));
                    } else {
                        System.out.println("Não é possível calcular a raiz quadrada de número negativo.");
                    }
                    
                    // Calcula o inverso se o número for diferente de 0
                    if (numero != 0) {
                        System.out.println("Inverso de " + numero + ": " + (1 / numero));
                    } else {
                        System.out.println("Não é possível calcular o inverso de 0.");
                    }
                }
            } catch (NumberFormatException e) {
                // Tratamento de erro no caso de o usuário digitar algo que não seja um número
                System.out.println("Erro: Entrada inválida. Por favor, digite um número.");
            }
        }
    }
}
 