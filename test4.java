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

   	 
    for(i = 0;j<num1.length-1;i++){
    	for(int j=i+1;j< num1.length;j++){
    		System.out.println("comparando" + num1[i] +">" +num1[j]);
    		if(num1[i] > num1[j]){
    			System.out.println("se sim inverter");
    			
    			//tecnica de swap 3 copos
    	int tmp = num1[i];
    	num1[i] = num1[j];
    	num1[j] = tmp;
    
    
   	  
   	 System.out.println("fim MAIOR : " +num1[j]);
   }
   
}}
}}}
   
   