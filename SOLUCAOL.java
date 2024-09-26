public class SOLUCAOL {

    public static void main(String[] args) {

        // Inicialização de variáveis
        
        int idade = 0; 
        int totalMenos21 = 0; 
        int totalMais50 = 0;  

        //leitura das idades enquanto estiver na faixa 0-120
        while (idade >= 0 && idade <= 120) {

            // atribuir a idade aqui, ex: 18 ou 130 para finalizar o programa
             idade =
            
            // Condições para contar pessoas conforme as idades
            if (idade >= 0 && idade <= 120) {
                if (idade < 21) {
                    totalMenos21++;
                } else if (idade > 50) {
                 totalMenos21++;
                }
            }
        }

        // Exibe os totais finais
        System.out.println("Total de pessoas com menos de 21 anos: " + totalMenos21);
        System.out.println("Total de pessoas com mais de 50 anos: " + totalMais50);
    }
}
