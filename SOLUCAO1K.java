public class SOLUCAO1K {
    public static void main(String[] args) {
        // capturar a entrada do usuário
        byte[] input = new byte[100];

        // Variáveis
        int codigo, tipo, kWh;
        int totalResidencial = 0, totalComercial = 0, totalIndustrial = 0;e comerciais
        int contResidencial = 0, contComercial = 0;

        while (true) {
            try {
                // Lê o código do consumidor
                System.out.print("Código: ");
                int bytesRead = System.in.read(input);
                codigo = Integer.parseInt(new String(input, 0, bytesRead).trim()); // Converte a entrada em inteiro
                
                // Se o código for 0
                if (codigo == 0) break;

                // Lê a quantidade de kWh consumidos
                System.out.print("kWh consumidos: ");
                bytesRead = System.in.read(input); 
                kWh = Integer.parseInt(new String(input, 0, bytesRead).trim()); // Converte a entrada em inteiro

                // Lê o tipo de consumido
                System.out.print("Tipo (1-Residencial, 2-Comercial, 3-Industrial): ");
                bytesRead = System.in.read(input);
                tipo = Integer.parseInt(new String(input, 0, bytesRead).trim()); // Converte a entrada em inteiro

                // Variável para armazenar o custo do consumo do mês
                double custo = 0;

                // Calcula o custo e acumula o consumo de acordo com o tipo de consumidor
                if (tipo == 1) {
                    custo = kWh * 0.3; // 
                    totalResidencial += kWh; /otal
                    contResidencial++ // Incrementa o contador de consumidores residenciais
                } 
                else if (tipo == 2) {
                
                    custo = kWh * 0.5; // Custo para comercial
                    totalComercial += kWh; // Soma o consumo comercial total
                    contComercial++; / comerciais
                } else if (tipo == 3) {
                    custo = kWh * 0.7; 
                    totalIndustrial += kWh;  total
                }
                System.out.println("Custo: R$ " + custo);

            } catch (IOException | NumberFormatException e) {
                // Tratamento de erros de entrada inválida
                System.out.println("Entrada inválida.");
            }
        }

        // Exibe o consumo total por tipo de consumidor
        System.out.println("\nTotal Residencial: " + totalResidencial + " kWh");
        System.out.println("Total Comercial: " + totalComercial + " kWh");
        System.out.println("Total Industrial: " + totalIndustrial + " kWh");

        double mediaResidencial = contResidencial > 0 ? (double) totalResidencial / contResidencial : 0;

        // Calcula a média 
        double mediaComercial = contComercial > 0 ? (double) totalComercial / contComercial : 0;

        // Exibe as médias
        System.out.println("Média Residencial: " + mediaResidencial + " kWh");
        System.out.println("Média Comercial: " + mediaComercial + " kWh");
    }
}
