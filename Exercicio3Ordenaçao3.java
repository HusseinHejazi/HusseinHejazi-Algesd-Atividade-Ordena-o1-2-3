public class Exercicio3Ordenaçao3{
   public static void insercao(int vet[])
      {
         for(int i=1; i<vet.length; i++)
         {
            int aux = vet[i];
            int j = i-1;        
            while(j>=0 && vet[j]<aux) // troca de sinal maior ">" para sinal menor "<"
            {
               vet[j-1] = vet[j]; // troca de vet[j+1] para vet[j-1]
               j--;
            }
            vet[j+1] = aux;
         }
      }
  

}