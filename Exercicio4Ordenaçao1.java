public class Exercicio4Ordenaçao1{ 
   public static void main(String[] args)
      {
         int [] vet = {1,3,5,2};
         boolean ordenado;
         ordenado = true; 
         for(int i=1; i<= vet.length-1; i++)
            for(int j=0; j<vet.length-i; j++)
               if(vet[j]>vet[j+1]) 
               {  ordenado = true;
                  int aux = vet[j];
                  vet[j] = vet[j+1];
                  vet[j+1] = aux;  
               }
               else{
               ordenado = false;
               }
                        if (ordenado){
                        System.out.println("Vetor é ordenado em ordem crescente");
                        }
                        else {
                        System.out.println("Vetor é ordenado em ordem decrescente");
                        }
      }

}