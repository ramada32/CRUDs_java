public class Aula{
   
   public static void main(String[]args){
       
       int a=5,b=4,j,i=0;
      double matrix[][] = new double[a][b];
       
       for (i = 0;i<a;i++){
       	   j=0;
       	   matrix[i][j] = i;
           System.out.println("numeros linhas" + matrix[i][j]);
       }
       for(j=0;j<a;j++){
       matrix[j][i] = j;
        System.out.println("numeros colunas" + matrix[i][j]);
       }
       
       
       }

   }

