public class SOLUCAO1C {
  public static void main(String[] args) {
    //numeros inteiros
    int[] numeros = {10, 20 ,30 ,40 ,50};
    int soma = 0;
    int totalNumeros = numeros.length;
    
    for (int i = 0; i < totalNumeros; i++) {
    //soma dos numeros 
    soma += numeros[i];
    
    }
    
    //calcula a media
    double media = (double) soma/ totalNumeros;
    //imprime a média
    System.out.println("A média dos números é: " + media);
    }
  }
 