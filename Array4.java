//Array 3
import java.util.Scanner;

public class Array4{

   public static void main(String[]args){
   
      Scanner n1 = new Scanner(System.in);
      int soma=0;
      int i;
      int op = 0;
      for(op = 0;op<=0;){
      if(op == 0 || op < 0){
      System.out.println("digite quantidade de elementos");
      op = n1.nextInt();
      }
      }
      double num1[] = new double[op];
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
      for (i=0;i<op;i++){
      	  
 
   System.out.println("digite um numero");
   num1[i] = n1.nextDouble();
  soma += num1[i];
   	 
     if(maior < num1[i]){
   	   
   	   	   maior = num1[i];
   }
     if(menor > num1[i]){
   	   	   menor = num1[i];
   	 }
   	 
   	   }
   	  
   	 System.out.println("fim MAIOR : " +maior+ "menor = " +menor+"soma = " +soma);
   }
   
   }
   
   