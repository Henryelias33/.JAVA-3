import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SOLUCAO1E {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            String nome = "";
            
            // Loop continua até o nome digitado for "FIM"
            while (!nome.equalsIgnoreCase("FIM")) {
                System.out.print("Digite um nome (ou FIM para encerrar): ");
                
                // Lê a entrada do usuário
                nome = reader.readLine();
                
                // Se o nome digitado for diferente de "FIM", imprime o nome
                if (!nome.equalsIgnoreCase("FIM")) {
                    System.out.println("Nome digitado: " + nome);
                }
            }
        } catch (IOException e) {
            // Tratamento de exceções em caso de erro de entrada/saída
            System.out.println("Erro ao ler entrada: " + e.getMessage());
        }
    }
}
