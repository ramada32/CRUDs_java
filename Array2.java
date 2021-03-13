//Scanner com vetor
import java.util.Scanner;

public class Array2{

   public static void main(String[]args){
   
     Scanner n1 = new Scanner(System.in);
   
     for(int i=0;i<5;i++){
          
         double num1[] = new double[5];
         System.out.println("digite numeros");
         num1[i] = n1.nextDouble();
         System.out.println("numero = " +num1[i]);
         }
       System.out.print("isso e tudo pessoal");
   }
}