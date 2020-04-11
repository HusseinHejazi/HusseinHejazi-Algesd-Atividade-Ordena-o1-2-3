public class Exercicio4Ordenação2{
   public static int indiceMenorElemento(int vet[], int inicio){
      int x = inicio;
      for(int j=inicio+1; j<vet.length; j++)
         {
            if(vet[j] > vet[x])
               x = j;
            }
            return x;
   }
   public static void selecao2(int vet[]){
      for(int i=0; i<vet.length-1; i++)
      {
         int indMenor = 1;
         indMenor = indiceMenorElemento (vet, i);
         int aux = vet[i];
         vet [i] = vet[indMenor];
         vet[indMenor] = aux;
         }
}
}

