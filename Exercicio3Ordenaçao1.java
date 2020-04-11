public class Exercicio3Ordenaçao1{
   public static void bolha2(int vet[])
      {
         for(int i=1; i<= vet.length-1; i++)
            for(int j=0; j<vet.length-i; j++)
               if(vet[j]<vet[j+1]) // foi trocado o sinal de maior ">" para menor "<"
               {
                  int aux = vet[j];
                  vet[j] = vet[j+1];
                  vet[j+1] = aux;
               }
      }
}