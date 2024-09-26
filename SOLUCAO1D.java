public class SOLUCAO1D {
   public static void main(String[] args) {
     int[] numeros = {125, 100, 200, 99, 50, 0};
       //variavel para contar os números de 100 a 200
           int contador = 0;
           for(int i = 0; i < numeros.length; i++) {
       //verificar se o número é o 0
    if(numeros[i] == 0) {
  Break;
 }
 
   //verificar se o numero esta entre 100 e 200
      if (numeros[i] >=100  && numeros[i] <= 200)
        contador++;
        }
     }
   //imprime o resultado
   System.out.println("quantidade de números entre 100 e 200: " + contador);
   
     }
 }
   
 

               
     