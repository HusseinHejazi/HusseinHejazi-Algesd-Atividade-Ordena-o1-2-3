public class Exercicio3Ordenaçao2{
public static void selecao(int vet[])
      {
         for(int i=0; i<vet.length-1; i++)
         {
            int indMenor = i;
            for(int j=i+1; j<vet.length; j++)
            {
               if(vet[j] > vet[indMenor]) // Sinal de menor "<" trocado para o sinal de maior ">"
                  indMenor = j;
            }
            int aux = vet[i];
            vet[i] = vet[indMenor];
            vet[indMenor] = aux;
         }
      }
}