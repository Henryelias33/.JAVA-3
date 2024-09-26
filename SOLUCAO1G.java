import javax.swing.JOptionPane;
public class SOLUCAO1G {
    public static void main(String[] args) {
        // Loop de 1 até 500
        for (int i = 1; i <= 500; i++) {
            // Verifica se o número é múltiplo de 5
            if (i % 5 == 0) {
                // Imprime o número
                System.out.println(i);
            }
        }
    }
}
