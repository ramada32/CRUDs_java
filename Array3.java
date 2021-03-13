//Array 3
import java.util.Scanner;

public class Array3{

   public static void main(String[]args){
   
      Scanner n1 = new Scanner(System.in);
      int op = 0;
      for(op = 0;op<=0;){
      if(op == 0 || op < 0){
      System.out.println("digite quantidade de elementos");
      op = n1.nextInt();
      }
      }
      for (int i=0;i<op;i++){
        double num1[] = new double[op];
   System.out.println("digite um numero");
   num1[i] = n1.nextDouble();
   System.out.println("valores = " +num1[i]);
   }
   System.out.println("fim");
   
   }

}